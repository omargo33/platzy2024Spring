package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {
    
    @GetMapping("/")
    @ApiOperation("Custom helo world message!!")
    @ApiResponse(code = 200, message = "OK")    
    public String saludar(){
            return "Hola test Omar Velez 🏁";
    }
}
