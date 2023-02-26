package com.example.gestiondecontact.dao;

import com.example.gestiondecontact.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

    @Query("select c from Contact c where c.nom like :x or c.prenom like :x")
    public List<Contact> chercher(@Param("x") String mc);
}
