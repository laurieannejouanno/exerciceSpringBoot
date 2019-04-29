package com.exercice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.springboot.dao.IEpreuveDAO;
import com.exercice.springboot.entities.Epreuve;

@Service
public class EpreuveService implements IEpreuveService {

	@Autowired
	private IEpreuveDAO epreuvedao;

	@Override
	public Epreuve findOneById(int id) {
		return epreuvedao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve e) {
		return epreuvedao.save(e);
	}

	@Override
	public void delete(Epreuve e) {
		epreuvedao.delete(e);
		
	}

	@Override
	public List<Epreuve> getAll() {
		return epreuvedao.findAll();
	}
	
}
