package com.digitalinnovation.bootcamp.aulaapi.repository;

import com.digitalinnovation.bootcamp.aulaapi.entities.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
}
