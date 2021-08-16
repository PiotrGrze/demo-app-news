package com.example.demoappnews.controllers;

import com.example.demoappnews.models.NewsDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api/v1/bad-news")
public class BadNewsController {

    @Value("${news.msg.bad}")
    private String badNewsMessage;

    @Value("${config: my default value}")
    private String configEnv;

    @GetMapping
    public NewsDTO showBadNews(HttpServletRequest request) {
        return new NewsDTO(badNewsMessage, configEnv,request.getRequestURI());
    }



}
