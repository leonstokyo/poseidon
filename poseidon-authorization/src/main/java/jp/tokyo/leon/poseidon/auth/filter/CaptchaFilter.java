package jp.tokyo.leon.poseidon.auth.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jp.tokyo.leon.poseidon.auth.exception.CaptchaException;
import jp.tokyo.leon.poseidon.auth.handler.LoginFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @author leon
 * @date 2024/3/29 00:41
 */
@Component
public class CaptchaFilter extends OncePerRequestFilter {

    private final LoginFailureHandler loginFailureHandler;

    public CaptchaFilter(LoginFailureHandler loginFailureHandler) {
        this.loginFailureHandler = loginFailureHandler;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String url = request.getRequestURI();
        if ("/login".equals(url) && "POST".equals(request.getMethod())) {
            // 校验验证码
            try {
                validate(request);
            } catch (CaptchaException e) {
                // 交给认证失败处理器
                loginFailureHandler.onAuthenticationFailure(request, response, e);
            }
        }
        filterChain.doFilter(request, response);
    }

    // 校验验证码逻辑
    private void validate(HttpServletRequest httpServletRequest) {
        String code = httpServletRequest.getParameter("code");
        //TODO validate code
    }
}
