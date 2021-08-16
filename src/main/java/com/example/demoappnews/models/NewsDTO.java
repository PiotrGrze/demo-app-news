package com.example.demoappnews.models;

import lombok.Getter;
import java.util.Date;

@Getter
public class NewsDTO {
    private String description;
    private Date timestamp;
    private String configEnv;
    private String endpoint;

    public NewsDTO(String description, String configEnv, String endpoint) {
        this.description = description;
        this.timestamp = new Date();
        this.configEnv = configEnv;
        this.endpoint = endpoint;
    }
}
