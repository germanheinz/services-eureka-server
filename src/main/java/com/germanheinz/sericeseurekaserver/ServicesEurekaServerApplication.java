package com.germanheinz.sericeseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicesEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesEurekaServerApplication.class, args);
    }

}
