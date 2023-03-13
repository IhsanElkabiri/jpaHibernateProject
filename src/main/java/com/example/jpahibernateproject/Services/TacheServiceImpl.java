package com.example.jpahibernateproject.Services;

import com.example.jpahibernateproject.Entities.Projet;
import com.example.jpahibernateproject.Entities.Tache;
import com.example.jpahibernateproject.Repositories.ProjetRepository;
import com.example.jpahibernateproject.Repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheServiceImpl implements TacheService{
    @Autowired
    TacheRepository tacheRepository;
    @Autowired
    ProjetRepository projetRepository;

    @Override
    public List<Tache> RechercherById(Long id_tache) {
        return tacheRepository.findAll(Sort.by(Sort.Direction.ASC, "id_tache"));
    }

    @Override
    public Tache ajouterTacheAunProjet(Tache tache, Long projet_id) {
        Projet projet = projetRepository.findById(projet_id).get();
        Tache tache1 = new Tache(tache.getId_tache(), tache.getTitre(), tache.getDescription(),projet);
        return tacheRepository.save(tache1);
    }

    @Override
    public void SupprimerTaches(Tache tache, Long projet_id) {
        Projet projet = projetRepository.findById(projet_id).get();
        Tache tache1 = new Tache(tache.getId_tache(), tache.getTitre(), tache.getDescription(),projet);
        tacheRepository.deleteAll();
    }

}
