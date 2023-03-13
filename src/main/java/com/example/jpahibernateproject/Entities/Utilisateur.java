package com.example.jpahibernateproject.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;
    private String nom;
    private String adresseEmail;
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Projet> projets;
}
