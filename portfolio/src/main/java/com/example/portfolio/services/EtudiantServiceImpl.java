package com.example.portfolio.services;

import com.example.portfolio.models.Etudiant;
import com.example.portfolio.repositories.EtudiantRepository;

public class EtudiantServiceImpl implements EtudiantService{

	EtudiantRepository er;
	@Override
	public Etudiant getEtudiant() {
		return er.findAll().get(0);
	}
	
	
	@Override
	public Etudiant setEtudiant(Etudiant e) {
		return er.save(e);
	}

}
