package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Autho {

    @GetMapping("/loginn")
    public String Login(){
        return "return the value";
    }

    @GetMapping("/siegin")
    public String Siegin(){
        return "This is the sigin value";
    }

    @PostMapping("/signup")
    public int Signupp(@RequestBody SignupData data){
        //return data.getNumber();
        return 0;
    }

    @PostMapping("/signupp")
    public SignupData Signup(@RequestBody SignupData data) { // Changed return type to SignupData
        return data; // Returns everything at once!
    }



}
