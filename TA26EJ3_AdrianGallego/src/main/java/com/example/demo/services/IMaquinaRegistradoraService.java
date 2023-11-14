package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MaquinaRegistradora;


public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listarMaquinasRegistradoras();
	
	public MaquinaRegistradora listarMaquinaRegistradoraById(Integer id);
	
	public MaquinaRegistradora guardarNuevo(MaquinaRegistradora m);

	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora m);
	
	public void deleteMaquinaRegistradora(Integer id);
}
