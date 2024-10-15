package com.example.setlistaggregatorjava.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.setlistaggregatorjava.model.Setlist;

//class/layer defines a repository (which is an interface) that interacts w database of setlists
//spring data jpa methods are used to perform basic db operations like saving and deleting

public interface SetlistRepository extends JpaRepository<Setlist, Long> {

    // Custom query methods based on method naming convention
    List<Setlist> findByArtist(String artist); // Finds all setlists by artist name

    List<Setlist> findByVenue(String venue); // Finds all setlists by venue

    List<Setlist> findByDateBetween(LocalDate startDate, LocalDate endDate); // Finds setlists between two dates
}