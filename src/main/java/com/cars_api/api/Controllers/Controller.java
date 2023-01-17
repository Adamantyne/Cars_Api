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
        return "Formato de dados: {modelo: String,fabricante: String,dataFabricacao: String,valor: double,anoModelo: int}";

    }

    @PostMapping
    public void postCar(@RequestBody CarDto req) {
        System.out.println(req);
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
    }
}
