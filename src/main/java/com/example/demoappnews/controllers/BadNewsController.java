package com.example.demoappnews.controllers;


import com.example.demoappnews.models.BadNews;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/bad-news")
public class BadNewsController {

    @Value("${news.msg.bad}")
    private String badNewsMessage;

    @Value("${config: my default value}")
    private String configEnv;


    @GetMapping
    public BadNews showBadNews(HttpServletRequest request) {
        BadNews badNews = new BadNews();
        badNews.setDescription(badNewsMessage);
        badNews.setEndpoint(request.getRequestURI());
        badNews.setTimestamp(new Date());
        badNews.setConfigEnv(configEnv);
        return badNews;
    }



}