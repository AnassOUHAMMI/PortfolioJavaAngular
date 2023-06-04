package com.example.portfolio.services;

import java.io.File;
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
		e.setCv(new File("\"C:\\Users\\Dell\\Desktop\\CvAlternanceAnassOUHAMMI.pdf\""));
		e.setPhoto_identite(new File("\"C:\\Users\\Dell\\Desktop\\CvAlternanceAnassOUHAMMI.pdf\""));
		e.setNom("OUHAMMI");
		return er.save(e);
	}

}
