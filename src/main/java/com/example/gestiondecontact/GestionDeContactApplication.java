package com.example.gestiondecontact;

import com.example.gestiondecontact.dao.ContactRepository;
import com.example.gestiondecontact.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class GestionDeContactApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionDeContactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat date =new SimpleDateFormat("dd/MM/yyyy");
        contactRepository.save(new Contact(
                "taib",
                "hicham",
                date.parse("08/12/2000"),
                "hicham@gmail.com",
                "0600148141",
                "photo1"

        ));contactRepository.save(new Contact(
                "taib",
                "omar",
                date.parse("08/12/2000"),
                "hicham@gmail.com",
                "0600148141",
                "photo1"

        ));contactRepository.save(new Contact(
                "taib",
                "abdelhak",
                date.parse("08/12/2000"),
                "hicham@gmail.com",
                "0600148141",
                "photo1"

        ));
        contactRepository.findAll().forEach(e->{
            System.out.println(e);
        });
    }
}
