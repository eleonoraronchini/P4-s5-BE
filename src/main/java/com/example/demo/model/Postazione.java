package com.example.demo.model;

import com.example.demo.model.enumerations.tipologiaPostazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="postazioni")
public class Postazione {
    @Id
    @GeneratedValue
    private Long id;
    private String descrizione;
    @Enumerated (EnumType.STRING)
    private tipologiaPostazione tipo;
    @Column(nullable = false)
    private int numMax;
    @ManyToOne (cascade = CascadeType.MERGE)
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    @Column (nullable = false)
    private boolean libera;

    public Postazione(String descrizione, tipologiaPostazione tipo, int numMax, Edificio edificio, boolean libera) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numMax = numMax;
        this.edificio = edificio;
        this.libera = libera;
    }
}
