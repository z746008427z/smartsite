package com.hzy.smartsite.cache.test;

import com.hzy.smartsite.cache.EnableMsCache;
import com.hzy.smartsite.cache.EnableMsCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableMsCache
public class CacheTest {
    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(CacheTest.class);
        app.run(args);
    }

}
