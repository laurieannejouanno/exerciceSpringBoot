package com.exercice.springboot.service;

import java.util.List;

import com.exercice.springboot.entities.Laboratoire;


public interface ILaboratoireService {

	Laboratoire findOneById(int numero);
	Laboratoire save(Laboratoire e);
	void delete(Laboratoire e);
	List<Laboratoire> getAll();
	
	
}
