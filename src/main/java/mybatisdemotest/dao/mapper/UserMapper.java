package mybatisdemotest.dao.mapper;

import com.example.model.UserExample;
import mybatisdemotest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @class: UserDao
 * @Description:
 * @Author: Dazo
 * @date: 28/4/2023
 */
public interface UserMapper extends Map<User> {
    /**
     * @return user 包含了 list<role> 通过 role可以取得 List<Resource>
     **/
    User selectUserById(Long id);
//    List<User> selectAll();

    @Mapper
    List<User> selectByExample(UserExample example);

    List<User> selectAll();

}

