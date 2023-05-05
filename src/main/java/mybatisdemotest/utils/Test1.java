package mybatisdemotest.utils;

import mybatisdemotest.dao.mapper.UserMapper;
import mybatisdemotest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;
import java.util.List;

/**
 * @version 1.0
 * @class: MyBatisExampleDemoTest
 * @Description:
 * @Author: Dazo
 * @date: 28/4/2023
 */
@Mapper
public class Test1 {
    @Test
    void test1() {

        com.example.model.UserExample example = new com.example.model.UserExample();
        example.createCriteria()
                .andCreatedTimeGreaterThanOrEqualTo(LocalDate.of(2022, 9, 1))
                .andNameLike("%李%")
                .andNameLike("%小%")
                .andStatusEqualTo(1);
        example.setOrderByClause("updated_time desc");

        UserMapper userMapper = null;
        List<User> userList = userMapper.selectByExample(example);

        // 断言查询结果是否符合预期
        Assertions.assertEquals(2, userList.size());
        Assertions.assertEquals("李小三", userList.get(0).getName());
        Assertions.assertEquals("李小四", userList.get(1).getName());
    }

}



