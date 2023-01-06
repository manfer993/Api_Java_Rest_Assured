package org.project.qa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resources {
    private String id;
    private String name;
    private String trademark;
    private String stock;
    private String price;
    private String description;
    @Singular
    private List<String> tags;
}
