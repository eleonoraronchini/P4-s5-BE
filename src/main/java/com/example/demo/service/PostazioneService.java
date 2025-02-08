package com.example.demo.service;

import com.example.demo.model.Postazione;
import com.example.demo.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
    @Autowired
    PostazioneDAORepository db;

    @Autowired
    @Qualifier("p1")
    ObjectProvider<Postazione> postazioneObjectProvider;
    public Postazione createPostazione1(){
        return postazioneObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p2")
    ObjectProvider<Postazione> postazione2ObjectProvider;
    public Postazione createPostazione2(){
        return postazione2ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p3")
    ObjectProvider<Postazione> postazione3ObjectProvider;
    public Postazione createPostazione3(){
        return postazione3ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p4")
    ObjectProvider<Postazione> postazione4ObjectProvider;
    public Postazione createPostazione4(){
        return postazione4ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p5")
    ObjectProvider<Postazione> postazione5ObjectProvider;
    public Postazione createPostazione5(){
        return postazione5ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p6")
    ObjectProvider<Postazione> postazione6ObjectProvider;
    public Postazione createPostazione6(){
        return postazione6ObjectProvider.getObject();
    }
    @Autowired
    @Qualifier("p7")
    ObjectProvider<Postazione> postazione7ObjectProvider;
    public Postazione createPostazione7(){
        return postazione7ObjectProvider.getObject();
    }

    //JPA method
    public void insertPostazione(Postazione p){
        db.save(p);
        System.out.println("Postazione inserita nel DB!");
    }

    public void updatePostazione (Postazione p){
        db.save(p);
        System.out.println("Postazione aggiornata nel DB!");
    }

    public void deletePostazione (Postazione p){
        db.delete(p);
        System.out.println("Postazione eliminata dal DB!");
    }
}
