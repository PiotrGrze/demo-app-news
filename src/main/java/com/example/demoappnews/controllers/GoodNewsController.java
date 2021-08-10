package com.example.demoappnews.controllers;

import com.example.demoappnews.models.GoodNews;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/good-news")
public class GoodNewsController {

    @Value("${news.msg.good}")
    private String goodNewsMessage;

    @Value("${config: my default value}")
    private String configEnv;


    @GetMapping
    public GoodNews showGoodNews(HttpServletRequest request) {
        GoodNews goodNews = new GoodNews();
        goodNews.setDescription(goodNewsMessage);
        goodNews.setUrlPoint(request.getRequestURI());
//TODO: localdatetime --> new Date
        goodNews.setLocalDateTime(LocalDateTime.now());
        goodNews.setConfigEnv(configEnv);
        return goodNews;
    }
}
