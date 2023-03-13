package com.example.jpahibernateproject.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tache;
    private String titre;
    private String description;

    @ManyToOne
    private Projet projet;

}
