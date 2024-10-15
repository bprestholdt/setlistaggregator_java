package com.example.setlistaggregatorjava.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.setlistaggregatorjava.model.Setlist;
import com.example.setlistaggregatorjava.repository.SetlistRepository;

//class/layer handles business logic. processes data, applies business rules and
//interacts w repository layer. Abstracts away underlying db operations
//processes result from repository db interaction and passes back to controller

@Service //mark class as Spring service
public class SetlistService {

    private final SetlistRepository setlistRepository;

    @Autowired // Injects the repository dependency
    public SetlistService(SetlistRepository setlistRepository) {
        this.setlistRepository = setlistRepository;
    }

   // Fetch all setlists
    public List<Setlist> getAllSetlists() {
        return setlistRepository.findAll();
    }

    // Fetch a setlist by ID
    public Optional<Setlist> getSetlistById(Long id) {
        return setlistRepository.findById(id);
    }
    // Saves the setlist to the database
    public Setlist createSetlist(Setlist setlist) {
        return setlistRepository.save(setlist); 
    }
 
    // Deletes the setlist by ID
    public void deleteSetlist(Long id) {
        setlistRepository.deleteById(id); 
    }
}