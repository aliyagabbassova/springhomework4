package ru.geekbrains.springhomework4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AboutController {
    @RequestMapping("/aboutpage")
    public String forPage() {
        return "aboutpage.html";
    }

    @GetMapping("/count")
    public String countNum(Model model) {
        int a = 20;
        int b = 30;
        int count = (a + b) / 2;
        model.addAttribute("number", count);
        return "countpage.html";
    }

}
