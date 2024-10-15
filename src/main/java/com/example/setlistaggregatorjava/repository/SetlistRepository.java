package com.example.setlistaggregatorjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.setlistaggregatorjava.model.Setlist;

public interface SetlistRepository extends JpaRepository<Setlist, Long> {
}