package com.example.demo.repository;

import com.example.demo.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteDAORepository extends JpaRepository<Utente,Long> {
    Utente findByName (String birthName);
}
