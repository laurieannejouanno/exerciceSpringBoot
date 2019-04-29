package com.exercice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.springboot.dao.IEleveDAO;
import com.exercice.springboot.entities.Eleve;

@Service
public class EleveService implements IEleveService{

	@Autowired
	private IEleveDAO elevedao;
	
	
	@Override
	public Eleve findOneById(int id) {
		return elevedao.getOne(id);
	}

	@Override
	public Eleve save(Eleve e) {
		return elevedao.save(e);
	}

	@Override
	public void delete(Eleve e) {
		elevedao.delete(e);
		
	}

	@Override
	public List<Eleve> getAll() {
		return elevedao.findAll();
	}

}
