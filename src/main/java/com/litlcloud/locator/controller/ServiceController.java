package com.litlcloud.locator.controller;

import com.litlcloud.locator.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ServiceController {

    @RequestMapping("/event")
    public Event getEvent() {
         Event newEvent = new Event();
         newEvent.setEventId(UUID.randomUUID());
         newEvent.setEmail("kgrauer626@gmail.com");
         newEvent.setLastName("grauer");
         return newEvent;
    }
}
