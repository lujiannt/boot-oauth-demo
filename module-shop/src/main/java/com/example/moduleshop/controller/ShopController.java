package com.example.moduleshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @RequestMapping("/service")
    public String service() {
        return "shop";
    }
}
