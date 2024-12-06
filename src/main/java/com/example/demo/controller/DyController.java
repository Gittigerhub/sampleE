package com.example.demo.controller;


import com.example.demo.DYdto.DyDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
@RequiredArgsConstructor

public class DyController {



    @GetMapping("/dy/register")
    public String regisertGet(DyDTO dyDTO){


        return "team/dy/register";

    }

    @PostMapping("/dy/register")
    public String registerPost(DyDTO dyDTO){

        log.info("컨트롤러로 들어온 값" + dyDTO);



        return "team/dy/list";
    }


    @GetMapping("/dy/list")
    public String list(){


        log.info("처음 작성했어요");


        return "team/dy/list";
    }


}
