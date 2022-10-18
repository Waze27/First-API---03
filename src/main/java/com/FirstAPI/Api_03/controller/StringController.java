package com.FirstAPI.Api_03.controller;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping
    public String concat(@RequestParam String prime, @RequestParam(required = false) String second) {
        if(second == null) {
            second = "";
        }
        return prime.concat(" " + second);
    }
}
