package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoDAO dao;
	
	@Override
	public List<Producto> listarProductos() {
		return dao.findAll();
	}

	@Override
	public Producto listarProductoById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Producto guardarNuevo(Producto p) {
		return dao.save(p);
	}

	@Override
	public Producto actualizarProducto(Producto p) {
		return dao.save(p);
	}

	@Override
	public void deleteProducto(Integer id) {
		dao.deleteById(id);
	}

}
