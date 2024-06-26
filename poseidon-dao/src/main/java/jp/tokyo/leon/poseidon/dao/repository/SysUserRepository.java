package jp.tokyo.leon.poseidon.dao.repository;

import jp.tokyo.leon.poseidon.dao.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * @author longtao.guan
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {
    Optional<SysUser> findStudentByUsername(String name);
}
