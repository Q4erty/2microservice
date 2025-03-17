package com.practice.beta.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic topic2() {
        return new NewTopic("topic2", 1, (short) 1);
    }
}
