package io.github.raxyz.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GravityControllerTest {
    private GravityController gravityController;

    GravityControllerTest() {
        this.gravityController = new GravityController();
    }

    @Test
    void greeting() {
        String s = "RomRom";
        String greeting = gravityController.greeting(s);
        assertEquals( "Greetings RomRom from Gravity Falls!", greeting);
    }

    @Test
    void greeting2() {
        String s = null;
        String greeting = gravityController.greeting(s);
        assertEquals( "Greetings  from Gravity Falls!", greeting);
    }
}
