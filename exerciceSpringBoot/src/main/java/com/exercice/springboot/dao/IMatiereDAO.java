package com.exercice.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.springboot.entities.Matiere;

@Repository
public interface IMatiereDAO extends JpaRepository<Matiere,Integer>{

}
