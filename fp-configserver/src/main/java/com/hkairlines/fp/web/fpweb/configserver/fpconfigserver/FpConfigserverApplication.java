package com.hkairlines.fp.web.fpweb.configserver.fpconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
@EnableEurekaClient
public class FpConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FpConfigserverApplication.class, args);
    }
}
