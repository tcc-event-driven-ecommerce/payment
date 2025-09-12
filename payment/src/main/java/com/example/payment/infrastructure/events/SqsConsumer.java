package com.example.payment.infrastructure.events;

import com.example.payment.core.domain.gateways.events.Consumer;
import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SqsConsumer implements Consumer {

    @Override
    @SqsListener("${sqs.queue.url}")
    public void receiveMessage(String message){
        log.info("Message");
    }
}
