package com.litlcloud.locator.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Event {
    private UUID eventId;
    private String email;
    private String lastName;
}
