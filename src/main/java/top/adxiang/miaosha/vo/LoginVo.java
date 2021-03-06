package top.adxiang.miaosha.vo;

import org.hibernate.validator.constraints.Length;
import top.adxiang.miaosha.validator.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * @author MaWenXiang
 * @date 2018/2/24
 */
public class LoginVo {

    @NotNull
    @IsMobile
    private String mobile;

    @NotNull
    @Length(min = 32)
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
