package yiming.chris.GrabCourses.vo;

import lombok.Data;


/**
 * ClassName:LoginInfoVO
 * Package:yiming.chris.GrabCourses.vo
 * Description:
 *
 * @Date:2022/6/25 2:05
 * @Author: ChrisEli
 */

public class LoginInfoVO {


    private String id;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginInfoVO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
