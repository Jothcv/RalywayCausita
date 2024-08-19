package com.RalyPe.Jhonatanas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhonatanController {

    @GetMapping("/nombre")
    public String getNombre(){
        return "Jhonatan alias Jothcv";
    }
}
