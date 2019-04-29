package com.exercice.springboot.service;

import java.util.List;


import com.exercice.springboot.entities.Matiere;

public interface IMatiereService {

	Matiere findOneById(int code);
	Matiere save(Matiere e);
	void delete(Matiere e);
	List<Matiere> getAll();
	
}
