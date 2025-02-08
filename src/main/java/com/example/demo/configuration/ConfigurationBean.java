package com.example.demo.configuration;


import com.example.demo.model.Edificio;
import com.example.demo.model.Postazione;
import com.example.demo.model.Prenotazione;
import com.example.demo.model.Utente;
import com.example.demo.model.enumerations.tipologiaPostazione;
import com.example.demo.repository.EdificioDAORepository;
import com.example.demo.repository.PostazioneDAORepository;
import com.example.demo.repository.UtenteDAORepository;
import com.example.demo.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("application.properties")
public class ConfigurationBean {
    @Autowired EdificioDAORepository edificioDAORepository;
    @Autowired PostazioneDAORepository postazioneDAORepository;
    @Autowired UtenteDAORepository utenteDAORepository;

    //UTENTI
    @Bean
    public Utente utente1 (){
        Utente u = new Utente("paolo.ron","Paolo Ronchini","paolo.ronchini@yahoo.it");
        return u;
    }

    @Bean
    public Utente utente2 (){
        Utente u = new Utente("cristina12","Cristina Muccini","cristina.muccini@outlook.it");
        return u;
    }
    @Bean
    public Utente utente3 (){
        Utente u = new Utente("ilariavez3","Ilaria Vezzoli","ilavezz3@gmail.it");
        return u;
    }
    @Bean

    public Utente utente4 (){
        Utente u = new Utente("haku95","Alberto Fraternali","alberto.fraternali@gmail.it");
        return u;
    }

    //EDIFICI

    @Bean
    public Edificio edificio1 (){
        Edificio e = new Edificio("Clinica dentale igiene&salute","viale Bella, 18","Rimini");
        return e;
    }
    @Bean
    public Edificio edificio2 (){
        Edificio e = new Edificio("Studio medico comunale n.2","viale Ortles, 24","Cattolica");
        return e;
    }
    @Bean
    public Edificio edificio3 (){
        Edificio e = new Edificio("Ufficio dell'aia","viale Novembre, 5","Bologna");
        return e;
    }
    @Bean
    @Scope("prototype")
    public Edificio edificio4 (){
        Edificio e = new Edificio("Palazzo delle ginestre","viale dei Giardinieri, 9","Bologna");
        return e;
    }



    //POSTAZIONI
@Bean
    public Postazione p1 (){
    Edificio clinicaDentale = edificioDAORepository.findByName ("Clinica dentale igiene&salute");
        if(clinicaDentale == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
    Postazione p = new Postazione("sala rossa", tipologiaPostazione.PRIVATO, 3, clinicaDentale, false);
    return p;
    }
    @Bean
    public Postazione p2 (){
        Edificio studioMedico = edificioDAORepository.findByName ("Studio medico comunale n.2");
        if(studioMedico == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("ambulatorio 4", tipologiaPostazione.PRIVATO, 4, studioMedico, true);
        return p;
    }

    @Bean
    public Postazione p3 (){
        Edificio UfficioAia = edificioDAORepository.findByName ("Ufficio dell'aia");
        if(UfficioAia == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("stanza delle ghirlande", tipologiaPostazione.OPENSPACE, 30, UfficioAia, true);
        return p;
    }

    @Bean
    public Postazione p4 (){
        Edificio palazzoGinestre = edificioDAORepository.findByName ("Palazzo delle ginestre");
        if(palazzoGinestre == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("stanza dei carri", tipologiaPostazione.OPENSPACE, 40, palazzoGinestre, true);
        return p;
    }
    @Bean
    public Postazione p5 (){
        Edificio palazzoGinestre = edificioDAORepository.findByName ("Palazzo delle ginestre");
        if(palazzoGinestre == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("sala principale", tipologiaPostazione.SALA_RIUNIONI, 22, palazzoGinestre, false);
        return p;
    }
    @Bean
    public Postazione p6 (){
        Edificio UfficioAia = edificioDAORepository.findByName ("Ufficio dell'aia");
        if(UfficioAia == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("stanza dei gelsi", tipologiaPostazione.PRIVATO, 10, UfficioAia, false);
        return p;
    }
    @Bean
    public Postazione p7 (){
        Edificio studioMedico = edificioDAORepository.findByName ("Studio medico comunale n.2");
        if(studioMedico == null){
            throw new RuntimeException("Edificio non trovato nel db");
        }
        Postazione p = new Postazione("ambulatorio 7", tipologiaPostazione.PRIVATO, 5, studioMedico, false);
        return p;
    }

    //PRENOTAZIONI
    @Bean
    public Prenotazione pren1 (){
        Postazione p7 = postazioneDAORepository.findByName("ambulatorio 7");
        Utente u2 = utenteDAORepository.findByName("Paolo Ronchini");
        Prenotazione p = new Prenotazione(p7,u2,"visita oculistica");
        return p;
    }

    @Bean
    public Prenotazione pren2 (){
        Postazione p5 = postazioneDAORepository.findByName("sala principale");
        Utente u3 = utenteDAORepository.findByName("Ilaria Vezzoli");
        Prenotazione p = new Prenotazione(p5,u3,"debrief aziendale");
        return p;
    }

    @Bean
    public Prenotazione pren3 (){
        Postazione p4 = postazioneDAORepository.findByName("stanza dei gelsi");
        Utente u4 = utenteDAORepository.findByName("Alberto Fraternali");
        Prenotazione p = new Prenotazione(p4,u4,"incontro amministrativo");
        return p;
    }

}