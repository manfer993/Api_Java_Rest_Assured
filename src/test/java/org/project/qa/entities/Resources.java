package org.project.qa.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@ToString
public class Resources {
    private final String id;
    private final String name;
    private final String trademark;
    private final String stock;
    private final String price;
    private final String description;
    @Singular
    private final List<String> tags;
}
