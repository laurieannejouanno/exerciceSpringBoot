package com.exercice.springboot.service;

import java.util.List;

import com.exercice.springboot.entities.Eleve;

public interface IEleveService {

	Eleve findOneById(int id);
	Eleve save(Eleve e);
	void delete(Eleve e);
	List<Eleve> getAll();
	
}
