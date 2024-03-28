package jp.tokyo.leon.poseidon.auth.handler;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jp.tokyo.leon.poseidon.auth.util.JwtUtils;
import jp.tokyo.leon.poseidon.common.model.ResponseResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author leon
 * @date 2024/3/29 00:14
 */
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        ServletOutputStream outputStream = response.getOutputStream();
        // 生成JWT，并放置到请求头中
        String jwt = JwtUtils.generateToken(authentication.getName());
        response.setHeader(JwtUtils.getCurrentConfig().getHeader(), jwt);
        ResponseResult<Object> result = ResponseResult.ok();
        outputStream.write(JSON.toJSONString(result).getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();
    }
}
