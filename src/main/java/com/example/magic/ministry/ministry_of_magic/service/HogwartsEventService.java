package com.example.magic.ministry.ministry_of_magic.service;

import com.example.magic.ministry.ministry_of_magic.model.HogwartsEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.List;

public interface HogwartsEventService {
    public void saveHogwartsEvent(ConsumerRecord<String, String> consumerRecord);
    public List<HogwartsEvent> getHogwartsEvents();
}
