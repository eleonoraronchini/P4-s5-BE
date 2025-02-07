package com.example.demo.repository;

import com.example.demo.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {
}
