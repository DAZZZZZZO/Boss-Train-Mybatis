package mybatisdemotest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.List;
import java.util.Set;

/**
 * @version 1.0
 * @class: USer
 * @Description:
 * @Author: Dazo
 * @date: 28/4/2023
 */

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer age;
    private Integer id;
    private String name;
    private Integer code;
    private String password;
    private String sex;
    private String phone;
    private String role;
//    private String department_id;
//    private String company_id;

    private Set<Role> roles;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
//                ", department_id='" + department_id + '\'' +
//                ", company_id='" + company_id + '\'' +
                '}';
    }


    public List<User> selectByConditions() {
        return null;

    }
}
