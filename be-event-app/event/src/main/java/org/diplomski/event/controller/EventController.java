package org.diplomski.event.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/api/event")
public class EventController {

    // TODO
    @PostMapping()
    public void createEvent() {}

    @PutMapping("/{id}")
    public void updateEvent() {}

    @DeleteMapping("/{id}")
    public void deleteEvent() {}

    @GetMapping("/{id}")
    public void getEvent() {}

    // TODO
    @GetMapping("")
    public void getAllEventsByOrganizer() {}

    // TODO
    @GetMapping("")
    public void getAllAvailableEvents() {}

}
