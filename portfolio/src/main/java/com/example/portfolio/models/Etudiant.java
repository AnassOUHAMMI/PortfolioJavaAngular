package com.example.portfolio.models;

import java.io.File;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@NoArgsConstructor
@Data
public class Etudiant {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nom;
	private String Prenom;
	private String statut;
	private File photo_identite;
	private File cv;
	private Date dateNaissance;
	private String description;
	@OneToMany(mappedBy = "etudiant")
	List<Formation> formations;
	@OneToMany(mappedBy = "etudiant")
	List<Stage> stages;
	
	
	public Etudiant(String nom, String prenom, String statut, File photo_identite, File cv, Date dateNaissance,
			String description) {
		super();
		this.nom = nom;
		Prenom = prenom;
		this.statut = statut;
		this.photo_identite = photo_identite;
		this.cv = cv;
		this.dateNaissance = dateNaissance;
		this.description = description;

	}


}
