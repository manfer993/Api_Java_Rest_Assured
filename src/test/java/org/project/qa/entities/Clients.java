package org.project.qa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clients {
    private String id;
    private String name;
    private String lastName;
    private String address;
    private String country;
    private String city;
    private String email;
    private String phone;
}
