package com.cars_api.api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars_api.api.dto.CarDto;

@RestController
@RequestMapping("/")

public class Controller {
    @GetMapping
    public String get(){
        return "Olá Spring";
    }

    @PostMapping
    public void postCar(@RequestBody CarDto req){
        System.out.println(req);
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
    }
}
