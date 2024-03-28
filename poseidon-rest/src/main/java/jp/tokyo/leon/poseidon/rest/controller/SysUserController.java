package jp.tokyo.leon.poseidon.rest.controller;

import jp.tokyo.leon.poseidon.common.model.ResponseResult;
import jp.tokyo.leon.poseidon.dao.entity.SysUser;
import jp.tokyo.leon.poseidon.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leon
 * @date 2024/3/28 21:38
 */
@RestController
@RequestMapping("admin/sys-user")
public class SysUserController {

    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @GetMapping("/get-by-username")
    public ResponseResult<SysUser> getByUsername(@RequestParam(name = "username") String username) {
        SysUser result = sysUserService.getByUsername(username);
        return ResponseResult.ok(result);
    }
}
