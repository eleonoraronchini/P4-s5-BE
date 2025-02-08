package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne (cascade = CascadeType.MERGE)
    private Postazione postazione;
    @ManyToOne (cascade = CascadeType.MERGE)
    @JoinColumn(name = "utente_id")
    private Utente utente;
    private LocalDateTime dataDiScadenza;
    private String descrizione;

    public Prenotazione(Postazione postazione, Utente utente, String descrizione) {
        this.id = id;
        this.postazione = postazione;
        this.utente = utente;
        this.dataDiScadenza =LocalDateTime.now().plusHours(24);
        this.descrizione = descrizione;
    }
}
