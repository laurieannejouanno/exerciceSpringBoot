package com.exercice.springboot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Section {
	
	@Id
	@GeneratedValue
	private int code;
	
	private String libelle;
	
	@OneToMany(mappedBy="section")
	private List<Eleve> listEleve;

	
	@ManyToMany
	private List<Matiere> listMat;
	
	public Section() {
		super();
	}




	public Section(String libelle) {
		super();
		this.libelle = libelle;
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




	public List<Eleve> getListEleve() {
		return listEleve;
	}




	public void setListEleve(List<Eleve> listEleve) {
		this.listEleve = listEleve;
	}




	@Override
	public String toString() {
		return "Section [code=" + code + ", libelle=" + libelle + ", listEleve=" + listEleve + "]";
	}
	
	
	
	
	
}
