package com.exercice.springboot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Laboratoire {

	@Id
	@GeneratedValue
	private int numero;
	private String nom;
	private int nombrePC;
	
	@OneToMany(mappedBy="laboratoire")
	private List<Epreuve> listEpreuve;

	public Laboratoire(String nom, int nombrePC) {
		super();
		this.nom = nom;
		this.nombrePC = nombrePC;
	}

	public Laboratoire() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombrePC() {
		return nombrePC;
	}

	public void setNombrePC(int nombrePC) {
		this.nombrePC = nombrePC;
	}

	public List<Epreuve> getListEpreuve() {
		return listEpreuve;
	}

	public void setListEpreuve(List<Epreuve> listEpreuve) {
		this.listEpreuve = listEpreuve;
	}

	@Override
	public String toString() {
		return "Laboratoire [numero=" + numero + ", nom=" + nom + ", nombrePC=" + nombrePC + ", listEpreuve="
				+ listEpreuve + "]";
	}
	
	
	
}
