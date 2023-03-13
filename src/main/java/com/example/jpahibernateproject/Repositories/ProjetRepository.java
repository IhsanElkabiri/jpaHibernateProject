package com.example.jpahibernateproject.Repositories;

import com.example.jpahibernateproject.Entities.Projet;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
    @Modifying
    @Transactional
    void saveWithUtilisateur(@Param("titre") String titre,
                             @Param("description") String description,
                             @Param("id_projet") long id_projet);
}
