package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Projet;

import java.util.List;

public interface ProjetService {
    List<Projet> RechercherById(Long id_projet);
    List<Projet> getAllProjets();


}
