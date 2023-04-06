package com.example.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// Başlangıçta maven and web app seç

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/message")
    @ResponseBody
    public String getMessage() {
        return "Test İletisi!";
    }
}
