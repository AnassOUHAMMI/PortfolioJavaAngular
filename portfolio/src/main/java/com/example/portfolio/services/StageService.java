package com.example.portfolio.services;

import com.example.portfolio.models.Formation;

public interface StageService {

	Formation getStageBynom(String nom);
	Formation getStageBynomcontains(String nom);
	Formation getStageByYear(String nom);

}
