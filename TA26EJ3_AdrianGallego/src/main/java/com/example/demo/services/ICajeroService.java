package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Cajero;

public interface ICajeroService {
	
	public List<Cajero> listarCajeros();
	
	public Cajero listarCajeroById(Integer id);
	
	public Cajero guardarNuevo(Cajero c);

	public Cajero actualizarCajero(Cajero c);
	
	public void deleteCajero(Integer id);

}
