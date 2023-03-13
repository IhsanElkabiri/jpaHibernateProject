package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Tache;

import java.util.List;

public interface TacheService {
    List<Tache> RechercherById(Long id_tache);
    Tache ajouterTacheAunProjet(Tache tache, Long projet_id);
    void SupprimerTaches(Tache tache , Long projet_id);

}
