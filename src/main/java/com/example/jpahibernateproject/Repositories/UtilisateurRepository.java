package com.example.jpahibernateproject.Repositories;

import com.example.jpahibernateproject.Entities.Projet;
import com.example.jpahibernateproject.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
