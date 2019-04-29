package com.exercice.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.springboot.entities.Epreuve;

@Repository
public interface IEpreuveDAO extends JpaRepository<Epreuve,Integer>{

}
