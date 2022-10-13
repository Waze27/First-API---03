package com.FirstAPI.Api_03.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping(value = "/{prime}/{second}")
    public String concat(@NotBlank(message = "mandatory") @PathVariable String prime, @PathVariable String second){
        return prime.concat(second);
    }
}
