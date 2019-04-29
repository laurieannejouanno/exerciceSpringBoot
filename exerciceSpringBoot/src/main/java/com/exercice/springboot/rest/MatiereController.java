package com.exercice.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.springboot.entities.Matiere;
import com.exercice.springboot.service.IMatiereService;

@RestController
public class MatiereController {

	@Autowired
	private IMatiereService matiereService;
	
	@GetMapping("/api/matiere/get/{code}")
	public Matiere findOneById(@PathVariable int code) {
		return matiereService.findOneById(code);
	}

	@PostMapping("/api/matiere/save")
	public Matiere save(@RequestBody Matiere p) {
		return matiereService.save(p);
	}

	@DeleteMapping("/api/matiere/delete")
	public void delete(@RequestBody Matiere p) {
		matiereService.delete(p);
	}

	@GetMapping("/api/matiere/getall")
	public List<Matiere> getAll() {
		return matiereService.getAll();
	}
	
}
