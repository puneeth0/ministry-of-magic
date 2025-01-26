package com.example.magic.ministry.ministry_of_magic.service;

import com.example.magic.ministry.ministry_of_magic.dao.HogwartsEventRepository;
import com.example.magic.ministry.ministry_of_magic.model.HogwartsEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HogwartsEventImpl implements HogwartsEventService{

    private final HogwartsEventRepository repository;

    public HogwartsEventImpl(HogwartsEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveHogwartsEvent(ConsumerRecord<String, String> consumerRecord) {
        repository.save(new HogwartsEvent(consumerRecord.key(),consumerRecord.value()));
    }

    @Override
    public List<HogwartsEvent> getHogwartsEvents() {
        return repository.findAll();
    }
}
