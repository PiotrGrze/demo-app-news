package com.example.demoappnews.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Date;

@AllArgsConstructor
@Getter
public class NewsDTO {
    private String description;
    private Date timestamp;
    private String configEnv;
    private String endpoint;

}
