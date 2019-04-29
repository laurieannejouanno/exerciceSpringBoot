package com.exercice.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.springboot.dao.ISectionDAO;
import com.exercice.springboot.entities.Section;

@Service
public class SectionService implements ISectionService {

	@Autowired
	private ISectionDAO sectiondao;
	
	@Override
	public Section findOneById(int code) {
		return sectiondao.getOne(code);
	}

	@Override
	public Section save(Section e) {
		return sectiondao.save(e);
	}

	@Override
	public void delete(Section e) {
		sectiondao.delete(e);
		
	}

	@Override
	public List<Section> getAll() {
		return sectiondao.findAll();
	}

}
