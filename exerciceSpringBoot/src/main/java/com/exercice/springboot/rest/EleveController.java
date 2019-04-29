package com.exercice.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.springboot.entities.Eleve;
import com.exercice.springboot.service.IEleveService;


@RestController
public class EleveController {

	@Autowired
	private IEleveService eleveService;
	
	@GetMapping("/api/eleve/get/{id}")
	public Eleve findOneById(@PathVariable int id) {
		return eleveService.findOneById(id);
	}

	@PostMapping("/api/eleve/save")
	public Eleve save(@RequestBody Eleve p) {
		return eleveService.save(p);
	}

	@DeleteMapping("/api/eleve/delete")
	public void delete(@RequestBody Eleve p) {
		eleveService.delete(p);
	}

	@GetMapping("/api/eleve/getall")
	public List<Eleve> getAll() {
		return eleveService.getAll();
	}
}
