package com.Cre8tiveDevsSoftware.EventPass.service;

import com.Cre8tiveDevsSoftware.EventPass.entity.Event;
import com.Cre8tiveDevsSoftware.EventPass.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    public Event saveEvent(Event event) {
        return  eventRepository.save(event);
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
}
