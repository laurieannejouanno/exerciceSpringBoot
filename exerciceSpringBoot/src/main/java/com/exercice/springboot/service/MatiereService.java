package com.exercice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.springboot.dao.IMatiereDAO;
import com.exercice.springboot.entities.Matiere;

@Service
public class MatiereService implements IMatiereService{

	@Autowired
	private IMatiereDAO matieredao;
	
	
	@Override
	public Matiere findOneById(int code) {
		return matieredao.getOne(code);
	}

	@Override
	public Matiere save(Matiere e) {
		return matieredao.save(e);
	}

	@Override
	public void delete(Matiere e) {
		matieredao.delete(e);
		
	}

	@Override
	public List<Matiere> getAll() {
		return matieredao.findAll();
	}

}
