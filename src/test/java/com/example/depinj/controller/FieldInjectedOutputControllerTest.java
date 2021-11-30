package com.example.depinj.controller;


import com.example.depinj.service.impl.OutputServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldInjectedOutputControllerTest {

    public FieldInjectedOutputController controller;

    @BeforeEach
    void setUp() {
        controller = new FieldInjectedOutputController();
        controller.outputService = new OutputServiceImpl();
    }

    @Test
    void doOutput() {
        System.out.println(controller.doOutput());
    }
}