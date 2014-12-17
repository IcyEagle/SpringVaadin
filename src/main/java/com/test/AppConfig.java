package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by eagle on 17.12.14.
 */
@Configuration
public class AppConfig {

    @Bean(name = "my_bean")
    public MyBean getMyBean() {
        return new MyBean();
    }

}
