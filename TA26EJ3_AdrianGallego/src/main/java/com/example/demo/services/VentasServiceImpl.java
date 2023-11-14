package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentasServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO dao;
	
	@Override
	public List<Venta> listarVentas() {
		return dao.findAll();
	}

	@Override
	public Venta listarVentaById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Venta guardarNuevo(Venta v) {
		return dao.save(v);
	}

	@Override
	public Venta actualizarVenta(Venta v) {
		return dao.save(v);
	}

	@Override
	public void deleteVenta(Integer id) {
		dao.deleteById(id);
	}

}
