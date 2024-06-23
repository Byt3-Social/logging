package com.byt3social.logging.amqp.subscribe.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogAMQPConfiguration {
    @Bean
    public Queue logQueue() {
        return QueueBuilder.nonDurable("log.logging").build();
    }

    @Bean
    public FanoutExchange apiGatewayFanoutExchange() {
        return ExchangeBuilder.fanoutExchange("api-gateway.ex").build();
    }

    @Bean
    public Binding bindLogToApiGateway() {
        return BindingBuilder.bind(logQueue()).to(apiGatewayFanoutExchange());
    }
}
