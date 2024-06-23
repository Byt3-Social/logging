package com.byt3social.logging.amqp.subscribe;

import com.byt3social.logging.dto.LogDTO;
import com.byt3social.logging.services.LogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
public class LogListener {
    @Autowired
    private LogService logService;

    @RabbitListener(queues = "log.logging")
    public void log(LogDTO logDTO) {
        logService.registrarLog(logDTO);
    }
}
