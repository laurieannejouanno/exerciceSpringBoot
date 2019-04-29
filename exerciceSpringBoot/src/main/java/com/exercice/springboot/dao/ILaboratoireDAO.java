package com.exercice.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.springboot.entities.Laboratoire;

@Repository
public interface ILaboratoireDAO extends JpaRepository<Laboratoire,Integer>{

}
