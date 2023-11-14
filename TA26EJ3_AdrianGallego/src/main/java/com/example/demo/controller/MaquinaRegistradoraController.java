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

import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.services.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {
	
	@Autowired
	MaquinaRegistradoraServiceImpl mSer;
	
	@GetMapping("/maquinasregistradoras")
	public List<MaquinaRegistradora> listarMaquinasRegistradoras(){
		return mSer.listarMaquinasRegistradoras();
	}
	
	@GetMapping("/maquinasregistradoras/{id}")
	public MaquinaRegistradora listarMaquinaRegistradoraById(@PathVariable(name="id") Integer id){
		return mSer.listarMaquinaRegistradoraById(id);
	}
	
	@PostMapping("/maquinasregistradoras")
	public MaquinaRegistradora guardarMaquina(@RequestBody MaquinaRegistradora m) {
		return mSer.guardarNuevo(m);	
	}
	
	@PutMapping("/maquinasregistradoras/{id}")
	public MaquinaRegistradora actualizarMaquina(@PathVariable(name="id") Integer id, @RequestBody MaquinaRegistradora m) {
		MaquinaRegistradora m1 = mSer.listarMaquinaRegistradoraById(id);
		MaquinaRegistradora m2 = new MaquinaRegistradora();
		
		m1.setCodigo_maquina(m.getCodigo_maquina());
		m1.setPiso(m.getPiso());
		
		m2 = mSer.actualizarMaquinaRegistradora(m1);
		
		return m2;
	}
	
	@DeleteMapping("/maquinasregistradoras/{id}")
	public void deleteMaquina(@PathVariable(name="id") Integer id) {
		mSer.deleteMaquinaRegistradora(id);
	}

}
