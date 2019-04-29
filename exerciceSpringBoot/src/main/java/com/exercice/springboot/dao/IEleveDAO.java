package com.exercice.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.springboot.entities.Eleve;

@Repository
public interface IEleveDAO extends JpaRepository<Eleve, Integer>{

}
