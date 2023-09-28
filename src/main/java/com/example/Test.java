package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @Bean
    public void hello(){
        logger.debug("Debug message");
        logger.info("fromm sout");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }

}
