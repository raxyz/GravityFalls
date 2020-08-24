package io.github.raxyz.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GravityController {
    public GravityController() {
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Gravity Falls!";
    }

    @RequestMapping("/{id}")
    public String greeting(@PathVariable String id) {
        if (id == null) {
            id = "";
        }
        return String.format("Greetings %s from Gravity Falls!", id);
    }

}
