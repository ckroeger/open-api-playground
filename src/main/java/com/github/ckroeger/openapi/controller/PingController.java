package com.github.ckroeger.openapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/ping")

public class PingController {

    @CrossOrigin(origins = "*")
    @GetMapping
    public String ping() {
        return "pong";
    }
}