package jp.tokyo.leon.poseidon.rest.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author leon
 * @date 2024/3/28 21:58
 */
@Configuration
@EnableJpaRepositories(basePackages = {"jp.tokyo.leon.poseidon.dao.repository"})
@EntityScan(basePackages = "jp.tokyo.leon.poseidon.dao.entity")
public class JpaConfig {
}
