package com.example.demo.controller;

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

import com.example.demo.dto.Cajero;
import com.example.demo.services.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {
	
	@Autowired
	CajeroServiceImpl cSer;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cSer.listarCajeros();
	}
	
	@GetMapping("/cajeros/{id}")
	public Cajero listarById(@PathVariable(name="id") Integer id) {
		return cSer.listarCajeroById(id);
	}
	
	@PostMapping("/cajeros")
	public Cajero guardarNuevo(@RequestBody Cajero c) {
		return cSer.guardarNuevo(c);
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name="id") Integer id, @RequestBody Cajero c) {
		Cajero c1 = cSer.listarCajeroById(id);
		Cajero c2 = new Cajero();
		
		c1.setCodigo_cajero(c.getCodigo_cajero());
		c1.setNom_apels(c.getNom_apels());
		
		c2 = cSer.actualizarCajero(c1);
		
		return c2;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void deleteCajero(@PathVariable(name="id") Integer id) {
		cSer.deleteCajero(id);
	}

}
