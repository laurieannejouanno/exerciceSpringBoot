package com.exercice.springboot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere {

	@Id
	@GeneratedValue
	private int code;
	
	private String libelle;
	private float duree;
	private int coefficient;
	
	@ManyToMany(mappedBy="listMat")
	private List<Section> listSection;
	
	@OneToMany(mappedBy="matiere")
	private List<Epreuve> listEpreuve;

	public Matiere(String libelle, float duree, int coefficient) {
		super();
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
	}

	public Matiere() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public List<Section> getListSection() {
		return listSection;
	}

	public void setListSection(List<Section> listSection) {
		this.listSection = listSection;
	}

	public List<Epreuve> getListEpreuve() {
		return listEpreuve;
	}

	public void setListEpreuve(List<Epreuve> listEpreuve) {
		this.listEpreuve = listEpreuve;
	}

	@Override
	public String toString() {
		return "Matiere [code=" + code + ", libelle=" + libelle + ", duree=" + duree + ", coefficient=" + coefficient
				+ ", listSection=" + listSection + ", listEpreuve=" + listEpreuve + "]";
	}
	
	
	
}
