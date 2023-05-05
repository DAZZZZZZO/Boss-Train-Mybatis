package mybatisdemotest.utils;

import com.github.pagehelper.PageHelper;
import mybatisdemotest.dao.mapper.UserMapper;
import mybatisdemotest.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @version 1.0
 * @class: MyBatisResultMapDemoTest
 * @Description:
 * @Author: Dazo
 * @date: 5/5/2023
 */
public class MyBatisResultMapDemoTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        User user = userMapper.selectUserById(1L);
        // 断言user.roles的数量
        Assert.assertEquals(2, user.getRoles().size());

        // 断言user.roles中Resource数量总和
        int total = user.getRoles().stream().mapToInt(r -> r.getResources().size()).sum();
        Assert.assertEquals(3, total);
    }

    @Test
    public void test2() {
        User user = userMapper.selectUserById(1L);
        // 断言user.roles 的数量
        // 断言 user.roles 中Resource数量总和
    }

    @Test
    public void test3() {
        // 启用分页
        PageHelper.startPage(1, 5);
        List<User> userList = userMapper.selectAll();
        // 断言user的数量是否符合分页的要求
        Assert.assertEquals(5, userList.size());
        // 判断user的数量，注意本次并无分页，所以数量应该为所有记录的数量
        long totalCount = PageHelper.count(() -> userMapper.selectAll());
        Assert.assertEquals(totalCount, userList.size());
    }

    @Test
    public void test4() {
        // 不启用分页
        List<User> userList = userMapper.selectAll();
        // 判断user的数量，注意本次并无分页，所以数量应该为所有记录的数量
        long totalCount = PageHelper.count(() -> userMapper.selectAll());
        Assert.assertEquals(totalCount, userList.size());
    }

}
