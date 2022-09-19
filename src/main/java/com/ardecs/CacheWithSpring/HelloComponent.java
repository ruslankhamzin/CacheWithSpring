package com.ardecs.CacheWithSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloComponent.class);

    @PostConstruct
    private void sayHello() {
        LOGGER.info("Hello Spring");
    }
}

