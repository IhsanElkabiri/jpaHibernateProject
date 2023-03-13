package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> RechercherById(Long id_utilisateur);
    void supprimerUtilisateur(Long id_utilisateur);


}
