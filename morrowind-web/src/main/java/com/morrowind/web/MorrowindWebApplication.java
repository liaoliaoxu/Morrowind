package com.morrowind.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author link.xu
 * @date 2022/12/7
 */
@SpringBootApplication(scanBasePackages = "com.morrowind.web", exclude = {
        RedisRepositoriesAutoConfiguration.class,
        RabbitAutoConfiguration.class,
        JdbcRepositoriesAutoConfiguration.class
}
)
public class MorrowindWebApplication{
    public static void main(String[] args) {
        SpringApplication.run(MorrowindWebApplication.class, args);
    }
}
