package com.exercice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.springboot.dao.ILaboratoireDAO;
import com.exercice.springboot.entities.Laboratoire;

@Service
public class LaboratoireService implements ILaboratoireService{

	@Autowired
	private ILaboratoireDAO labdao;
	
	@Override
	public Laboratoire findOneById(int numero) {
		return labdao.getOne(numero);
	}

	@Override
	public Laboratoire save(Laboratoire e) {
		return labdao.save(e);
	}

	@Override
	public void delete(Laboratoire e) {
		labdao.delete(e);
		
	}

	@Override
	public List<Laboratoire> getAll() {
		return labdao.findAll();
	}

}
