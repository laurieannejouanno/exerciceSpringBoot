package com.exercice.springboot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Eleve implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="code")
	private Section section;

	@ManyToMany
	@JoinTable(
	        name = "Eleve_Epreuve", 
	        joinColumns = { @JoinColumn(name = "eleve_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "matiere_id") }
	    )
	private List<Epreuve> listEpreuves;
	
	
	
	public Eleve() {
		super();
	}


	
	
	public Eleve(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}




	public Eleve(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public Section getSection() {
		return section;
	}


	public void setSection(Section section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", section=" + section + "]";
	}
	
	
	
	
}
