package com.example.jpahibernateproject.Repositories;
import com.example.jpahibernateproject.Entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Long> {
}
