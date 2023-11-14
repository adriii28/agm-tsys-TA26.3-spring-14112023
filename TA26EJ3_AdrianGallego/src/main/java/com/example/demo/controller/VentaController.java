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

import com.example.demo.dto.Venta;
import com.example.demo.services.VentasServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentasServiceImpl vSer;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return vSer.listarVentas();
	}
	
	@GetMapping("/ventas/{id}")
	public Venta listarVentasById(@PathVariable(name="id") Integer id) {
		return vSer.listarVentaById(id);
	}
	
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta v) {
		return vSer.guardarNuevo(v);	
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name="id") Integer id, @RequestBody Venta v) {
		Venta v1 = vSer.listarVentaById(id);
		Venta v2 = new Venta();
		
		v1.setId(v.getId());
		v1.setCajero(v.getCajero());
		v1.setProducto(v.getProducto());
		v1.setMaquina_reguistradora(v.getMaquina_reguistradora());
		
		v2 = vSer.actualizarVenta(v1);
		return v2;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void deleteVentas(@PathVariable(name="id") Integer id) {
		vSer.deleteVenta(id);
	}
	

}
