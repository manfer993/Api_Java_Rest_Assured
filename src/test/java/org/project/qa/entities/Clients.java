package org.project.qa.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Clients {
    private final String id;
    private final String name;
    private final String lastName;
    private final String address;
    private final String country;
    private final String city;
    private final String email;
    private final String phone;
}
