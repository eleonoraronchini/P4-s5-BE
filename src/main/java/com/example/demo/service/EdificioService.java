package com.example.demo.service;

import com.example.demo.model.Edificio;
import com.example.demo.model.Utente;
import com.example.demo.repository.EdificioDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    EdificioDAORepository db;

    @Autowired
    @Qualifier("edificio1")
    ObjectProvider<Edificio> edificioObjectProvider;
    public Edificio createEdificio1(){
        return edificioObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("edificio2")
    ObjectProvider<Edificio> edificio2ObjectProvider;
    public Edificio createEdificio2(){
        return edificio2ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("edificio3")
    ObjectProvider<Edificio> edificio3ObjectProvider;
    public Edificio createEdificio3(){
        return edificio3ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("edificio4")
    ObjectProvider<Edificio> edificio4ObjectProvider;
    public Edificio createEdificio4(){
        return edificio4ObjectProvider.getObject();
    }

    //JPA method
    public void insertEdificio(Edificio e){
        db.save(e);
        System.out.println("Edificio inserito nel DB!");
    }

    public void updateEdificio (Edificio e){
        db.save(e);
        System.out.println("Edificio aggiornato nel DB!");
    }

    public void deleteTavolo (Edificio e){
        db.delete(e);
        System.out.println("Edificio eliminato dal DB!");
    }
}
