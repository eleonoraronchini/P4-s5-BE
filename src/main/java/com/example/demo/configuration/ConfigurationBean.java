package com.example.demo.configuration;


import com.example.demo.model.Edificio;
import com.example.demo.model.Postazione;
import com.example.demo.model.Prenotazione;
import com.example.demo.model.Utente;
import com.example.demo.model.enumerations.tipologiaPostazione;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("application.properties")
public class ConfigurationBean {

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
    public Edificio edificio4 (){
        Edificio e = new Edificio("Palazzo delle ginestre","viale dei Giardinieri, 9","Bologna");
        return e;
    }


    //POSTAZIONI

    @Bean
    public Postazione p1 (){
        Postazione p = new Postazione("sala 1", tipologiaPostazione.PRIVATO,3,edificio1(),true);
        return p;
    }

    @Bean
    public Postazione p2 (){
        Postazione p = new Postazione("sala dei giocolieri", tipologiaPostazione.OPENSPACE,30,edificio3(),true);
        return p;
    }
    @Bean
    public Postazione p3 (){
        Postazione p = new Postazione("sala rossa", tipologiaPostazione.SALA_RIUNIONI,20,edificio2(),true);
        return p;
    }
    @Bean
    public Postazione p4 (){
        Postazione p = new Postazione("sala blue", tipologiaPostazione.PRIVATO,10,edificio2(),false);
        return p;
    }
    @Bean
    public Postazione p5 (){
        Postazione p = new Postazione("sala dei tulipani", tipologiaPostazione.OPENSPACE,40,edificio4(),false);
        return p;
    }
    @Bean
    public Postazione p6 (){
        Postazione p = new Postazione("sala dei ciliegi", tipologiaPostazione.SALA_RIUNIONI,20,edificio4(),false);
        return p;
    }
    @Bean
    public Postazione p7 (){
        Postazione p = new Postazione("sala 6", tipologiaPostazione.PRIVATO,6,edificio1(),true);
        return p;
    }

    //PRENOTAZIONI
    @Bean
    public Prenotazione pren1 (){
        Prenotazione p = new Prenotazione(p4(),utente2(),"visita oculistica");
        return p;
    }

    @Bean
    public Prenotazione pren2 (){
        Prenotazione p = new Prenotazione(p6(),utente4(),"debrief aziendale");
        return p;
    }

    @Bean
    public Prenotazione pren3 (){
        Prenotazione p = new Prenotazione(p5(),utente1(),"incontro amministrativo");
        return p;
    }


}
