package com.example.demo.service;

import com.example.demo.model.Postazione;
import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    UtenteDAORepository db;

    @Autowired
    @Qualifier("utente1")
    ObjectProvider<Utente> utenteObjectProvider;
    public Utente createUtente1(){
        return utenteObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("utente2")
    ObjectProvider<Utente> utente2ObjectProvider;
    public Utente createUtente2(){
        return utente2ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("utente3")
    ObjectProvider<Utente> utente3ObjectProvider;
    public Utente createUtente3(){
        return utente3ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("utente4")
    ObjectProvider<Utente> utente4ObjectProvider;
    public Utente createUtente4(){
        return utente4ObjectProvider.getObject();
    }

    //JPA method
    public void insertUtente(Utente u){
        db.save(u);
        System.out.println("Utente inserito nel DB!");
    }

    public void updateUtente (Utente u){
        db.save(u);
        System.out.println("Utente aggiornato nel DB!");
    }

    public void deleteUtente (Utente u){
        db.delete(u);
        System.out.println("Utente eliminato dal DB!");
    }
}
