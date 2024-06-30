package com.ganeshgc.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("real-kafka-topic")
                //.partitions(1) use can use for required partition i ma using default one.
                //.replicas(1)
                .build();



    }
}
