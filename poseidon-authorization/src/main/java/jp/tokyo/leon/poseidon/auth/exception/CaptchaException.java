package jp.tokyo.leon.poseidon.auth.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @author leon
 * @date 2024/3/29 00:30
 */
public class CaptchaException extends AuthenticationException {
    public CaptchaException(String msg) {
        super(msg);
    }
}
