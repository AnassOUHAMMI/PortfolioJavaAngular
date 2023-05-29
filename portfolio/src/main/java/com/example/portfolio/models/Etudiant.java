package com.example.portfolio.models;

import java.io.File;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
	
	@OneToMany
	List<Formation> formations;
	@OneToMany
	List<Stage> stages;
	
	
	


}
