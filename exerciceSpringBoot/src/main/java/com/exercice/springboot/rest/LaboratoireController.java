package com.exercice.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.springboot.entities.Laboratoire;
import com.exercice.springboot.service.ILaboratoireService;

@RestController
public class LaboratoireController {

	
	@Autowired
	private ILaboratoireService laboratoireService;
	
	@GetMapping("/api/laboratoire/get/{numero}")
	public Laboratoire findOneById(@PathVariable int numero) {
		return laboratoireService.findOneById(numero);
	}

	@PostMapping("/api/laboratoire/save")
	public Laboratoire save(@RequestBody Laboratoire p) {
		return laboratoireService.save(p);
	}

	@DeleteMapping("/api/laboratoire/delete")
	public void delete(@RequestBody Laboratoire p) {
		laboratoireService.delete(p);
	}

	@GetMapping("/api/laboratoire/getall")
	public List<Laboratoire> getAll() {
		return laboratoireService.getAll();
	}
	
}
