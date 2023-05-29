package com.example.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio.models.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	

}
