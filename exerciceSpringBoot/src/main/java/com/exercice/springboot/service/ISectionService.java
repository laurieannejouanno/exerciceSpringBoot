package com.exercice.springboot.service;

import java.util.List;

import com.exercice.springboot.entities.Section;

public interface ISectionService {

	Section findOneById(int code);
	Section save(Section e);
	void delete(Section e);
	List<Section> getAll();
	
}
