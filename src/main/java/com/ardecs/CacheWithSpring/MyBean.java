package com.ardecs.CacheWithSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);
        @Bean(initMethod = "init")
        public MyBean helloBean(){
            return new MyBean();
        }
        public void init(){
            LOGGER.info("Hello Spring!");
        }
}
