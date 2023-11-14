package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();
	
	public Venta listarVentaById(Integer id);
	
	public Venta guardarNuevo(Venta v);

	public Venta actualizarVenta(Venta v);
	
	public void deleteVenta(Integer id);
}
