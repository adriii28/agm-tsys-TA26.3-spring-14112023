package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{

	@Autowired
	ICajeroDAO dao;
	
	@Override
	public List<Cajero> listarCajeros() {
		return dao.findAll();
	}

	@Override
	public Cajero listarCajeroById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Cajero guardarNuevo(Cajero c) {
		return dao.save(c);
	}

	@Override
	public Cajero actualizarCajero(Cajero c) {
		return dao.save(c);
	}

	@Override
	public void deleteCajero(Integer id) {
		dao.deleteById(id);
		
	}

}
