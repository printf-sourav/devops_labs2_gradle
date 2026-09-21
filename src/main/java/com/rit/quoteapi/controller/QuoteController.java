package com.rit.quoteapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public String getQuote() {
        return "To be, or not to be, that is the question.";
    }

    @GetMapping("/health")
    public String getHealth() {
        return "OK";
    }
}
