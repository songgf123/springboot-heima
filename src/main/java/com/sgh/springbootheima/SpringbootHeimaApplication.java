package com.sgh.springbootheima;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootHeimaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHeimaApplication.class, args);
        log.info("启动成功");
        log.info("启动成功哈哈");
        log.info("启动成功哈哈,hot-fix");
        log.info("启动成功哈哈,hot-fix2");
    }

}
