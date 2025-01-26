package com.example.magic.ministry.ministry_of_magic.kafka.consumer;

import com.example.magic.ministry.ministry_of_magic.service.HogwartsEventService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HogwartsEventConsumer {

    private final HogwartsEventService service;

    public HogwartsEventConsumer(HogwartsEventService service) {
        this.service = service;
    }

    @KafkaListener(
            topics = {"owl_postal_service"}
            //, autoStartup = "${libraryListener.startup:true}"
            , groupId = "library-events-listener-group")
    public void onMessage(ConsumerRecord<String, String> consumerRecord) throws JsonProcessingException {
        service.saveHogwartsEvent(consumerRecord);
        System.out.println("ConsumerRecord  "+ consumerRecord);
    }
}
