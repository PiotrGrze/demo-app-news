package com.example.demoappnews.models;

import java.util.Date;


public class GoodNews {


    private String description;
    private Date timestamp;
    private String configEnv;
    private String urlPoint;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
