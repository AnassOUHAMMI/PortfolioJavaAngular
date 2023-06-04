package com.example.portfolio;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.portfolio.models.Etudiant;
import com.example.portfolio.repositories.EtudiantRepository;

@SpringBootTest
class PortfolioApplicationTests {
	@Autowired
	private EtudiantRepository er;

	@Test
	public void creerEtudiantTest() {
	    Etudiant e = new Etudiant("anass", "ouhammi", "etudiant", null, null, new Date(), "anaaaa");
	    Etudiant savedEtudiant = er.save(e);
	    
	    // Autres assertions pour vérifier les propriétés de l'étudiant sauvegardé si nécessaire
	}

}
