package com.exercice.springboot.service;

import java.util.List;

import com.exercice.springboot.entities.Epreuve;


public interface IEpreuveService {

	Epreuve findOneById(int id);
	Epreuve save(Epreuve e);
	void delete(Epreuve e);
	List<Epreuve> getAll();
	
}
