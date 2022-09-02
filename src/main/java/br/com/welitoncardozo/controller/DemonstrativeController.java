package br.com.welitoncardozo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demonstrative")
public class DemonstrativeController {
    @PostMapping
    public String execute() {
        return "Demonstrative";
    }
}
