package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "edifici")
public class Edificio {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String adress;
    @Column(nullable = false)
    private String city;
    @OneToMany(mappedBy = "edificio", cascade = CascadeType.MERGE)
    private List<Postazione> postazioniEdificio;

    public Edificio(String name, String adress, String city) {
        this.name = name;
        this.adress = adress;
        this.city = city;
    }
}
