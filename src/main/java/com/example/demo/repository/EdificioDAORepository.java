package com.example.demo.repository;

import com.example.demo.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EdificioDAORepository extends JpaRepository<Edificio,Long> {
    Edificio findByName(String name);
    }

