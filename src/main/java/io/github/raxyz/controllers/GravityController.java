package io.github.raxyz.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GravityController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Gravity Falls!";
    }

}
