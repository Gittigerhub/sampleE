package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class KebEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long num;

    private String title;

}


