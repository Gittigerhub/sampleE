package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class worldController {

    @GetMapping("/team/world/list")
    public String list(){

        log.info("깃 확인용" +
                "controller" +
                "입니다" +
                "!!!!!");

        return "team/world/list";
    }
}
