package com.example.setlistaggregatorjava.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.setlistaggregatorjava.model.Setlist;
import com.example.setlistaggregatorjava.service.SetlistService;

//class handles http requests and interacts with service layer. Maps incoming requests from frontend/api consumer to service calls
//sends response back to api consumer/frontend

@RestController // Marks this class as a REST controller
@RequestMapping("/setlists") // Base URL for all endpoints in this controller
public class SetlistController {

    private final SetlistService setlistService;

    @Autowired
    public SetlistController(SetlistService setlistService) {
        this.setlistService = setlistService;
    }

    @GetMapping // Handles GET requests to /setlists
    public List<Setlist> getAllSetlists() {
        return setlistService.getAllSetlists(); // Returns a list of all setlists
    }

    @GetMapping("/{id}") // Handles GET requests to /setlists/{id}
    public Optional<Setlist> getSetlistById(@PathVariable Long id) {
        return setlistService.getSetlistById(id); // Returns a setlist by ID
    }

    @PostMapping // Handles POST requests to /setlists
    public Setlist createSetlist(@RequestBody Setlist setlist) {
        return setlistService.createSetlist(setlist); // Creates a new setlist
    }

    @DeleteMapping("/{id}") // Handles DELETE requests to /setlists/{id}
    public void deleteSetlist(@PathVariable Long id) {
        setlistService.deleteSetlist(id); // Deletes a setlist by ID
    }
}
