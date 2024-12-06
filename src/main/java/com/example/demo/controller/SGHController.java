package com.example.demo.controller;


import com.example.demo.Repository.SGHRepository;
import com.example.demo.Service.SGHService;
import com.example.demo.entity.SGHEntity;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@Log4j2
@RequestMapping("/SGH")
@RequiredArgsConstructor
public class SGHController {

    private  final SGHRepository sghRepository;

    @GetMapping("/list")
    public String list(SGHEntity entity){

        sghRepository.save(entity);



        return "/SGH/list";
    }




}
