package jp.tokyo.leon.poseidon.auth.config;

import com.auth0.jwt.algorithms.Algorithm;
import lombok.Data;

import java.util.List;

/**
 * @author leon
 * @date 2024/3/28 23:18
 */
@Data
public class JwtConfig {

    /**
     * JwtToken Header标签
     */
    private String header;
    /**
     * Token头
     */
    private String tokenHead;
    /**
     * 签发者
     */
    private String issuer;
    /**
     * 密钥
     */
    private String secretKey;
    /**
     * Token 过期时间
     */
    private long expirationTime;
    /**
     * 签发者列表
     */
    private List<String> issuers;
    /**
     * 接受者
     */
    private String audience;
    /**
     * 加密算法
     */
    private Algorithm algorithm;

}
