package com.example.jpahibernateproject.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedNativeQuery(name="Projet.saveWithUtilisateur",query = "insert into Projet(titre, description, id_utilisateur) VALUES (:titre, :description, :id)")
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_projet;
    private String titre;
    private String description;
    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "projet")
    private Set<Tache> tache;

}
