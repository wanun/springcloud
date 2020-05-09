package com.hkairlines.fp.web.fpcore.fpcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Configuration
public class FpCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FpCoreApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) throws InterruptedException {
        Thread.sleep(12000);
        String str = "hi " + name + ",i am from port:" + port;
        System.out.println(str);
        return str;
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/test")
    public String hi(){
        return foo;
    }
}
