package jp.tokyo.leon.poseidon.service.impl;

import jp.tokyo.leon.poseidon.dao.entity.SysUser;
import jp.tokyo.leon.poseidon.dao.repository.SysUserRepository;
import jp.tokyo.leon.poseidon.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @author longtao.guan
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    private final SysUserRepository sysUserRepository;

    public SysUserServiceImpl(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findStudentByUsername(username).orElse(null);
    }
}
