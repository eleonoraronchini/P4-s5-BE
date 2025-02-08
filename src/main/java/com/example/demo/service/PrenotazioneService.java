package com.example.demo.service;

import com.example.demo.model.Postazione;
import com.example.demo.model.Prenotazione;
import com.example.demo.model.Utente;
import com.example.demo.repository.PostazioneDAORepository;
import com.example.demo.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneDAORepository db;
    @Autowired
    PostazioneDAORepository dbPostazione;

    @Autowired
    @Qualifier("pren1")
    ObjectProvider<Prenotazione> prenotazioneObjectProvider;
    public Prenotazione createPrenotazione1(){
        return prenotazioneObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("pren2")
    ObjectProvider<Prenotazione> prenotazione2ObjectProvider;
    public Prenotazione createPrenotazione2(){
        return prenotazione2ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("pren3")
    ObjectProvider<Prenotazione> prenotazione3ObjectProvider;
    public Prenotazione createPrenotazione3(){
        return prenotazione3ObjectProvider.getObject();
    }

    //JPA method
    public void insertPrenotazione(Prenotazione p){
        db.save(p);
        System.out.println("Prenotazione inserita nel DB!");
    }

    public void updatePrenotazione (Prenotazione p){
        db.save(p);
        System.out.println("Prenotazione aggiornata nel DB!");
    }

    public void deletePrenotazione (Prenotazione p){
        db.delete(p);
        System.out.println("Prenotazione eliminata dal DB!");
    }
    // Metodo per effettuare una prenotazione
    public String prenotaPostazione(Postazione postazione, Utente utente, String descrizione) {

        if (postazione.isLibera()) {
            Prenotazione prenotazione = new Prenotazione(postazione, utente, descrizione);

            prenotazione.setDataDiScadenza(LocalDateTime.now().plusHours(24));

            db.save(prenotazione);

            // Modifica lo stato della postazione in "non libera"
            postazione.setLibera(false);
            dbPostazione.save(postazione);
            System.out.println("Prenotazione effettuata con successo!");
            return"Prenotazione effettuata con successo!";
        } else {
            System.out.println("La postazione non è disponibile per la data richiesta.");
            return "La postazione non è disponibile per la data richiesta.";
        }
    }
}
