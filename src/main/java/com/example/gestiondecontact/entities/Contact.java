package com.example.gestiondecontact.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact implements Serializable {
    @Id @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date DateDeNaissance;
    private String email;
    private String tel;
    private String photo;

    public Contact(String nom, String prenom, Date dateDeNaissance, String email, String tel, String photo) {
        this.nom = nom;
        this.prenom = prenom;
        DateDeNaissance = dateDeNaissance;
        this.email = email;
        this.tel = tel;
        this.photo = photo;
    }
}
