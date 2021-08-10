package com.example.demoappnews.models;

import java.time.LocalDateTime;


public class GoodNews {


    private String description;
    private LocalDateTime localDateTime;
    private String configEnv;
    private String urlPoint;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getConfigEnv() {
        return configEnv;
    }

    public void setConfigEnv(String configEnv) {
        this.configEnv = configEnv;
    }

    public String getUrlPoint() {
        return urlPoint;
    }

    public void setUrlPoint(String urlPoint) {
        this.urlPoint = urlPoint;
    }
}
