package com.example.portfolio.services;

import com.example.portfolio.models.Formation;

public interface FormationService {
	
	Formation getFormationBynom(String nom);
	Formation getFormationBynomcontains(String nom);
	Formation getFormationByYear(String nom);



}
