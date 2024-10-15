package com.example.setlistaggregatorjava.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//class/layer(model layer) defines structures of data to be stored in database
//models are called entities in spring boot because they refer directly to a db table

@Entity // Marks this class as a database entity (table)
public class Setlist {

    @Id // Marks the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the ID/primary key
    private Long id; //identifier for each setlist

    private String artist;
    private String venue;
    private LocalDate date;

    // Default constructor 
    public Setlist() {}

    // Constructor to initialize all fields
    public Setlist(String artist, String venue, LocalDate date) {
        this.artist = artist;
        this.venue = venue;
        this.date = date;
    }

    // Getters and setters for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
