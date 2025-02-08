package com.example.demo.runner;

import com.example.demo.model.Edificio;
import com.example.demo.model.Postazione;
import com.example.demo.model.Prenotazione;
import com.example.demo.model.Utente;
import com.example.demo.service.EdificioService;
import com.example.demo.service.PostazioneService;
import com.example.demo.service.PrenotazioneService;
import com.example.demo.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired EdificioService edificioService;
    @Autowired UtenteService utenteService;
    @Autowired PostazioneService postazioneService;
    @Autowired PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {

        Edificio e1 = edificioService.createEdificio1();
        Edificio e2 = edificioService.createEdificio2();
        Edificio e3 = edificioService.createEdificio3();
        Edificio e4 = edificioService.createEdificio4();


        Utente u1 = utenteService.createUtente1();
        Utente u2 = utenteService.createUtente2();
        Utente u3 = utenteService.createUtente3();
        Utente u4 = utenteService.createUtente4();


       /* edificioService.insertEdificio(e1);
        edificioService.insertEdificio(e2);
        edificioService.insertEdificio(e3);
        edificioService.insertEdificio(e4);

        utenteService.insertUtente(u1);
        utenteService.insertUtente(u2);
        utenteService.insertUtente(u3);
        utenteService.insertUtente(u4);*/


        Postazione p1 = postazioneService.createPostazione1();
       // postazioneService.insertPostazione(p1);
        Postazione p2 = postazioneService.createPostazione2();
       // postazioneService.insertPostazione(p2);

        Postazione p3 = postazioneService.createPostazione3();
       // postazioneService.insertPostazione(p3);

        Postazione p4 = postazioneService.createPostazione4();
       // postazioneService.insertPostazione(p4);

        Postazione p5 = postazioneService.createPostazione5();
      //  postazioneService.insertPostazione(p5);

        Postazione p6 = postazioneService.createPostazione6();
       // postazioneService.insertPostazione(p6);

        Postazione p7 = postazioneService.createPostazione7();
        // postazioneService.insertPostazione(p7);


        Prenotazione pren1 = prenotazioneService.createPrenotazione1();
       // prenotazioneService.insertPrenotazione(p1);

        Prenotazione pren2 = prenotazioneService.createPrenotazione2();
       // prenotazioneService.insertPrenotazione(p2);

        Prenotazione pren3 = prenotazioneService.createPrenotazione3();
       // prenotazioneService.insertPrenotazione(p3);

        prenotazioneService.prenotaPostazione(p5,u3,"Prova");




    }
}
