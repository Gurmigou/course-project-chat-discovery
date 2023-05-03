package com.videochat.videochatbackenddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VideoChatBackendDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoChatBackendDiscoveryApplication.class, args);
    }

}
