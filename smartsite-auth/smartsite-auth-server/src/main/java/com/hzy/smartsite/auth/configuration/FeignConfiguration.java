package com.hzy.smartsite.auth.configuration;

import com.hzy.smartsite.auth.interceptor.ClientTokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzy on 2017/9/12.
 */
@Configuration
public class FeignConfiguration {
    @Bean
    ClientTokenInterceptor getClientTokenInterceptor(){
        return new ClientTokenInterceptor();
    }
}
