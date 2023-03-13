package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Utilisateur;
import com.example.jpahibernateproject.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> RechercherById(Long id_utilisateur) {
        return utilisateurRepository.findAll(Sort.by(Sort.Direction.ASC, "id_utilisateur"));
    }

    @Override
    public void supprimerUtilisateur(Long id_utilisateur) {
        utilisateurRepository.deleteById(id_utilisateur);
    }
}
