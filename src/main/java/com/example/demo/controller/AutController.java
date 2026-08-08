package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AutController {

    @GetMapping("/login")
    public String Login(){
        return "This is the Controller Login";
    }

    @PostMapping("/sigin")
    public String CreateAcoount(){
        return "This is the controller Signup ";
    }

    @DeleteMapping("/reset")
    public String ResetPassword(){
        return "THis is the controller reset passweord";
    }
}
