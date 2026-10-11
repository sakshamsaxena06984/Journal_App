package com.edigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCare {


    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }
}
