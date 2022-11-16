package com.example.test.repository;

import com.example.test.entities.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite,Integer> {
}
