package org.springframework.cloud.connector.dependency;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;

public class CloudConfig extends AbstractCloudConfig {

    @Bean
    public MyService key() {
        return (MyService) connectionFactory().service(MyService.class);
    }
}
