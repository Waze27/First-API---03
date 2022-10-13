package com.FirstAPI.Api_03.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping(value = "")
    public String concat(@NotBlank(message = "mandatory") String prime, String second){
        prime = "Mirko ";
        second = "Di Cristina";
        return prime.concat(second);
    }
}
