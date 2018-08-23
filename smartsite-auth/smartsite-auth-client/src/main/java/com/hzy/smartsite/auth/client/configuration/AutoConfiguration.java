package com.hzy.smartsite.auth.client.configuration;

import com.hzy.smartsite.auth.client.config.ServiceAuthConfig;
import com.hzy.smartsite.auth.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzy on 2017/9/15.
 */
@Configuration
@ComponentScan({"com.hzy.smartsite.auth.client","com.hzy.smartsite.auth.common"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
