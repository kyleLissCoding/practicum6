package edu.iu.p466.arithmetic_service.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping
    public String greeting(){
        return "Greetings user to the Arithmetic Service!";
    }
}
