package org.diplomski.event.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Event {

    @Id
    private long id;
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private int availableSeats;
    private String description;
    private String program;

    // TODO dodati price ako zelim

    @Embedded
    private Location location;
}
