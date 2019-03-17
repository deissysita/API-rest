package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	List<GestorBD> gestores=Data.llenarGestores();
	GestorBD gestor=new GestorBD();
	
	@GetMapping("/get")
	List<GestorBD> todos() {
		return gestores;
	}

	@PostMapping("/post")
	String agregar(@RequestBody GestorBD newGestor) {
		gestores.add(newGestor);
		return "Se agregó el gestor";
	}

	@GetMapping("/get/{id}")
	GestorBD uno(@PathVariable int id) {
		return gestores.stream().filter(gestorByid->gestorByid.getId()==id).findAny().orElse(null);
	}

	@PutMapping("/put/{id}")
	List<GestorBD> modificar(@RequestBody GestorBDUpdate upGestor, @PathVariable int id) {
		gestores.stream().filter(gestorByid->gestorByid.getId()==id).forEach(gestorByid->gestorByid.setNombre(upGestor.getNombre()));
		return gestores;
	}

	@DeleteMapping("/del/{id}")
	List<GestorBD> borrar(@PathVariable int id) {
		gestores.removeIf(gestor->gestor.getId()==id);
		return gestores;
	}
}
