package dev.be.blackjack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {"dev.be.modulecommon", "dev.be.blackjack"}
)
@EntityScan("dev.be.modulecommon.entity")
@EnableJpaRepositories(basePackages = {"dev.be.modulecommon.repository"})
public class BlackjackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackjackApplication.class, args);
    }

}
