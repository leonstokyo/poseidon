package jp.tokyo.leon.poseidon.service;

import jp.tokyo.leon.poseidon.dao.entity.SysUser;

/**
 * @author longtao.guan
 */
public interface SysUserService {
    SysUser getByUsername(String username);
}
