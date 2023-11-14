package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService{

	@Autowired
	IMaquinaRegistradoraDAO dao;
	
	@Override
	public List<MaquinaRegistradora> listarMaquinasRegistradoras() {
		return dao.findAll();
	}

	@Override
	public MaquinaRegistradora listarMaquinaRegistradoraById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public MaquinaRegistradora guardarNuevo(MaquinaRegistradora m) {
		return dao.save(m);
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora m) {
		return dao.save(m);
	}

	@Override
	public void deleteMaquinaRegistradora(Integer id) {
		dao.deleteById(id);
	}

}
