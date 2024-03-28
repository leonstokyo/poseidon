package jp.tokyo.leon.dao.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author longtao.guan
 */
@Setter
@Getter
@Entity(name = "sys_user")
public class SysUser extends BaseEntity{

    private String username;

    private String password;

    private String mobile;

    private String email;

    private Byte status;

}
