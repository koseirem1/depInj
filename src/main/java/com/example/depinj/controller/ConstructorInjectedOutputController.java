package com.example.depinj.controller;

import com.example.depinj.service.OutputService;
import org.springframework.stereotype.Controller;


public class ConstructorInjectedOutputController {

    private final OutputService outputService;

    public ConstructorInjectedOutputController(OutputService outputService){
        this.outputService=outputService;
    }


    public String doOutput(){
        System.out.println("ConstructorInjected is working..");
        return this.outputService.getOutput();
    }

}
