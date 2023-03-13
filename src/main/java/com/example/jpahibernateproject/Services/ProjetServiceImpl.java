package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Projet;
import com.example.jpahibernateproject.Repositories.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService{
    @Autowired
    ProjetRepository projetRepository;

    @Override
    public List<Projet> RechercherById(Long id_projet) {
        return projetRepository.findAll(Sort.by(Sort.Direction.ASC, "id_projet"));
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }
}
