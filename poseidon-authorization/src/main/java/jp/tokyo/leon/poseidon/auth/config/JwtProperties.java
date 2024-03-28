package jp.tokyo.leon.poseidon.auth.config;

import jakarta.annotation.PostConstruct;
import jp.tokyo.leon.poseidon.auth.util.JwtUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author leon
 * @date 2024/3/28 23:46
 */
@Data
@Slf4j
@Configuration
@ConfigurationProperties(prefix = "leon.poseidon.jwt")
public class JwtProperties {
    /**
     * JwtToken Header标签
     */
    private String header;
    /**
     * Token头
     */
    private String tokenHeader;
    /**
     * 签发者
     */
    private String issuer;
    /**
     * 密钥
     */
    private String secret;
    /**
     * Token 过期时间
     */
    private long expire;

    @PostConstruct
    public void jwtInit() {
        JwtUtils.initialize(header, tokenHeader, issuer, secret, expire);
        log.info("[JwtProperties] JwtUtils init finished...");
    }
}
