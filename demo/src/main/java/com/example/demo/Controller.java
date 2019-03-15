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
		return Data.buscar(id, gestores);
	}

	@PutMapping("/put/{id}")
	String modificar(@RequestBody GestorBDUpdate upGestor, @PathVariable int id) {
		gestor=Data.buscar(id, gestores);
		if(gestor!=null) {
			gestores.remove(gestor);
			gestor.setNombre(upGestor.getNombre());
			gestores.add(gestor);
			return "Se modificó el gestor";
		}else {
			return "No existe el gestor";
		}
	}

	@DeleteMapping("/del/{id}")
	String borrar(@PathVariable int id) {
		gestor=Data.buscar(id, gestores);
		gestores.remove(gestor);
		return "Se eliminó el gestor";
	}
}
