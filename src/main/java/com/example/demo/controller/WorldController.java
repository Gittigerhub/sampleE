package com.example.demo.controller;

import com.example.demo.Repository.WorldRepository;
import com.example.demo.entity.WorldEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/team/world")
public class WorldController {

    private final WorldRepository worldRepository;

    @GetMapping("/list")
    public String list(WorldEntity worldEntity){

        log.info("깃 확인용" +
                "controller" +
                "입니다" +
                "!!!");

        worldRepository.save(worldEntity);

        return "team/world/list";
    }
}
