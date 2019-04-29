package com.exercice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.exercice.springboot.dao.IEleveDAO;
import com.exercice.springboot.entities.Eleve;

@SpringBootApplication
public class ExerciceSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExerciceSpringBootApplication.class, args);
		IEleveDAO edao = ctx.getBean(com.exercice.springboot.dao.IEleveDAO.class);
		Eleve e = new Eleve("nom1","prenom1");
		edao.save(e);
	}

}
