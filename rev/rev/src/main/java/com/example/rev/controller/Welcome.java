package com.example.rev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class Welcome {

    @RequestMapping("")
    public String welcome() {
        return "Seja bem vindo a aula 1";
    }
}
