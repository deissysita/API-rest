package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Tdepar;
import com.example.repository.TdeparRepository;
import com.example.update.TdeparUpdate;

@RestController
@RequestMapping("/rest/JPA")
public class Controller {
	 
	@Autowired
	TdeparRepository departamentos;
	
	private Tdepar depto = new Tdepar();
	
	@GetMapping("/departamentos")
	List<Tdepar> getAllDeptos() {
		return departamentos.findAll();
	}
	
	@GetMapping("/departamentosById/{id}")
	Tdepar getOneDepto(@PathVariable String id) {
		return departamentos.findOne(id);
	}
	
	@PostMapping("/addDpto")
	void createDepto(@RequestBody Tdepar depto) {
		departamentos.save(depto);
	}
	
	@PutMapping("/upDpto/{id}")
	void updateDepto(@RequestBody TdeparUpdate deptoUp, @PathVariable String id) {
		depto=departamentos.findOne(id);
		depto.setNomdep(deptoUp.getNomdep());
		depto.setNumdirec(deptoUp.getNumdirec());
		departamentos.save(depto);
	}
	
	@DeleteMapping("/delDpto/{id}")
	void deleteDepto(@PathVariable String id) {
		departamentos.delete(id);
	}
}
