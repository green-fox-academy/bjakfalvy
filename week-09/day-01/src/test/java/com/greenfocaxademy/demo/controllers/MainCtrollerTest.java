package com.greenfocaxademy.demo.controllers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainCtrollerTest {

    @Test
    public void frontend() {
        MainController controller = new MainController();
        String result = controller.frontend();

        assertEquals("index", result);
    }
}
