package com.mangalsathi.identity.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/account";
    }

    @GetMapping("/account")
    public String account() {
        return "account";
    }
}
