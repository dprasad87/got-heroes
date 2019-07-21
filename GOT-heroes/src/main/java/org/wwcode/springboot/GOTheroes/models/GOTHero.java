package org.wwcode.springboot.GOTheroes.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class GOTHero {

    @JsonProperty(value = "hero-name")
    private String name;
    @JsonProperty(value = "hero-id")
    private int id;
    @JsonProperty(value = "hero-allegiance")
    private String allegiance;
    @JsonProperty(value = "hero-title")
    private String title;
    @JsonProperty(value = "hero-image-url")
    private String immageUrl;
}
