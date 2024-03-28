package jp.tokyo.leon.poseidon.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author longtao.guan
 */
@SpringBootApplication
@ComponentScan(basePackages = {"jp.tokyo.leon.poseidon.service",
        "jp.tokyo.leon.poseidon.rest", "jp.tokyo.leon.poseidon.auth"
})
public class PoseidonRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoseidonRestApplication.class);
    }

}
