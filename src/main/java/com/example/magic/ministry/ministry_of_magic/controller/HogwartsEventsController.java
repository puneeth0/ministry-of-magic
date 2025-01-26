package com.example.magic.ministry.ministry_of_magic.controller;

import com.example.magic.ministry.ministry_of_magic.model.HogwartsEvent;
import com.example.magic.ministry.ministry_of_magic.service.HogwartsEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ministry/events")
public class HogwartsEventsController {

    private final HogwartsEventService service;

    public HogwartsEventsController(HogwartsEventService service) {
        this.service = service;
    }

    @GetMapping
    public List<HogwartsEvent> getHogwartsEvents() {
        // Create character entity

        List<HogwartsEvent> list = service.getHogwartsEvents();
        System.out.println(list);
        return list;
    }
}
