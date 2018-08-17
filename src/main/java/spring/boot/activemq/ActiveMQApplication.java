package spring.boot.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 武海升
 * @date 2018/8/17 10:53
 */
@SpringBootApplication
@Slf4j
public class ActiveMQApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMQApplication.class, args);
        log.info("Application  Spring Boot ActiveMQ start-up is success!");
    }

}
