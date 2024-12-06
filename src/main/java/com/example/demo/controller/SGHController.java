package com.example.demo.controller;


import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@Log4j2
@RequestMapping("/SGH")
public class SGHController {


    @GetMapping("/list")
    public String list(){


        return "/SGH/list";
    }




}
