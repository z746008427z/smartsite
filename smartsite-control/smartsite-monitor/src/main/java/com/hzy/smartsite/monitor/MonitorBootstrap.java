package com.hzy.smartsite.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class MonitorBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MonitorBootstrap.class, args);
    }
}
