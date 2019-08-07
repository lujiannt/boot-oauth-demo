package com.example.moduleclient1.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return "client111";
    }

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    @RequestMapping("/securedPage")
    public String securedPage() {
        return "/securedPage";
    }
}
