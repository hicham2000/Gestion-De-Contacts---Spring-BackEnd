package com.example.gestiondecontact;

import com.example.gestiondecontact.dao.ContactRepository;
import com.example.gestiondecontact.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionDeContactApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionDeContactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact(null,"hicham","0600148141"));
        contactRepository.findAll().forEach(e->{
            System.out.println(e);
        });
    }
}
