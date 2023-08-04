package com.Cre8tiveDevsSoftware.EventPass.controller;

import com.Cre8tiveDevsSoftware.EventPass.entity.Event;
import com.Cre8tiveDevsSoftware.EventPass.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> addEvent(Event event) {
        return new ResponseEntity<>(eventService.saveEvent(event), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvent() {
        return new ResponseEntity<>(eventService.getAllEvents(), HttpStatus.ACCEPTED);
    }
}
