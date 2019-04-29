package com.exercice.springboot.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Epreuve {

	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private String heure;
	
	@ManyToOne
	@JoinColumn(name="code")
	private Matiere matiere;
	
	@ManyToOne
	@JoinColumn(name="numero")
	private Laboratoire laboratoire;
	
	@ManyToMany(mappedBy="listEpreuves")
	private List<Eleve> listEleve;

	public Epreuve(Date date, String heure) {
		super();
		this.date = date;
		this.heure = heure;
	}

	public Epreuve() {
		super();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Eleve> getListEleve() {
		return listEleve;
	}

	public void setListEleve(List<Eleve> listEleve) {
		this.listEleve = listEleve;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Epreuve [date=" + date + ", heure=" + heure + ", matiere=" + matiere + ", laboratoire=" + laboratoire
				+ ", listEleve=" + listEleve + "]";
	}
	
	
	
}
