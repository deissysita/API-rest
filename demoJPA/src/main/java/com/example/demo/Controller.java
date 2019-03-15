package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Rep_tdepar;
import entity.Tdepar;

@RestController
public class Controller {
	@Autowired
    Rep_tdepar t_deparRep;
	
	// Get All Notes
	@GetMapping("/departamentos")
	public List<Tdepar> getAllDeptos() {
	    return t_deparRep.findAll();
	}
}
