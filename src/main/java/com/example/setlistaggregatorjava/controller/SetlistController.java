package com.example.setlistaggregatorjava.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetlistController {
    @GetMapping("/setlists")
    public String getSetlists() {
        return "Setlist data here";
    }
}