package com.example.depinj.controller;

import com.example.depinj.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class SetterInjectedOutputController {

    private OutputService outputService;


    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public String doOutput(){
        System.out.println("SetterInjected is working..");
        return outputService.getOutput();
    }

}
