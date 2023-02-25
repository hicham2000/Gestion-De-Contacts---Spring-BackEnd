package com.example.gestiondecontact.dao;

import com.example.gestiondecontact.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
