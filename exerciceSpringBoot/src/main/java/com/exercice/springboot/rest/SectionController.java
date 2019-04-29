package com.exercice.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.springboot.entities.Section;
import com.exercice.springboot.service.ISectionService;

@RestController
public class SectionController {

	@Autowired
	private ISectionService sectionService;
	
	@GetMapping("/api/section/get/{code}")
	public Section findOneById(@PathVariable int code) {
		return sectionService.findOneById(code);
	}

	@PostMapping("/api/section/save")
	public Section save(@RequestBody Section p) {
		return sectionService.save(p);
	}

	@DeleteMapping("/api/section/delete")
	public void delete(@RequestBody Section p) {
		sectionService.delete(p);
	}

	@GetMapping("/api/section/getall")
	public List<Section> getAll() {
		return sectionService.getAll();
	}
	
}
