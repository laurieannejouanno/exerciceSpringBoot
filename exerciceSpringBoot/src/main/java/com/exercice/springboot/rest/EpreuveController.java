package com.exercice.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.springboot.entities.Epreuve;
import com.exercice.springboot.service.IEpreuveService;

@RestController
public class EpreuveController {

	
	@Autowired
	private IEpreuveService epreuveService;
	
	@GetMapping("/api/epreuve/get/{id}")
	public Epreuve findOneById(@PathVariable int id) {
		return epreuveService.findOneById(id);
	}

	@PostMapping("/api/epreuve/save")
	public Epreuve save(@RequestBody Epreuve p) {
		return epreuveService.save(p);
	}

	@DeleteMapping("/api/epreuve/delete")
	public void delete(@RequestBody Epreuve p) {
		epreuveService.delete(p);
	}

	@GetMapping("/api/epreuve/getall")
	public List<Epreuve> getAll() {
		return epreuveService.getAll();
	}
	
}
