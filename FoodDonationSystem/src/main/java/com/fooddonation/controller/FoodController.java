package com.fooddonation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/")
    public String home() {
        return "index"; // Corresponds to src/main/resources/templates/index.html
    }
}

