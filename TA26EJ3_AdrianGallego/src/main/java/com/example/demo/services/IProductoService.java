package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Producto;

public interface IProductoService {
	
	public List<Producto> listarProductos();
	
	public Producto listarProductoById(Integer id);
	
	public Producto guardarNuevo(Producto p);

	public Producto actualizarProducto(Producto p);
	
	public void deleteProducto(Integer id);
}
