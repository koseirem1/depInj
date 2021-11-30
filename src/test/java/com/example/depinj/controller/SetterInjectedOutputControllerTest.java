package com.example.depinj.controller;


import com.example.depinj.service.impl.OutputServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SetterInjectedOutputControllerTest {

    SetterInjectedOutputController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedOutputController();
        controller.setOutputService(new OutputServiceImpl());
    }

    @Test
    void doOutput() {
        System.out.println(controller.doOutput());
    }
}