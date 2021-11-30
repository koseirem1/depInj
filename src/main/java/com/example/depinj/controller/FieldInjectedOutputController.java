package com.example.depinj.controller;

import com.example.depinj.service.OutputService;
import com.example.depinj.service.impl.OutputServiceImpl;


public class FieldInjectedOutputController {


    public OutputService outputService;

    public String doOutput() {
        System.out.println("FieldInjected is working..");
        return outputService.getOutput();
    }
}
