package com.exercice.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.springboot.entities.Section;

@Repository
public interface ISectionDAO extends JpaRepository<Section, Integer>{

}
