package com.example.demoappnews.controllers;

import com.example.demoappnews.models.NewsDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api/v1/good-news")
public class GoodNewsController {

    @Value("${news.msg.good}")
    private String goodNewsMessage;

    @Value("${config: my default value}")
    private String configEnv;

    @GetMapping
    public NewsDTO showGoodNews(HttpServletRequest request) {
        return new NewsDTO(goodNewsMessage, configEnv,request.getRequestURI());
    }
}
