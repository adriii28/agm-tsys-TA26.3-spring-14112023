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

import com.example.demo.dto.Producto;
import com.example.demo.services.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl pSer;
	
	@GetMapping("/productos")
	public List<Producto> listarProducto(){
		return pSer.listarProductos();
	}
	
	@GetMapping("/productos/{id}")
	public Producto listarProductoById(@PathVariable(name="id") Integer id){
		return pSer.listarProductoById(id);
	}
	
	@PostMapping("/productos")
	public Producto guardarNuevo(@RequestBody Producto p) {
		return pSer.guardarNuevo(p);
	}
	
	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name="id") Integer id, @RequestBody Producto p) {
		Producto p1 = pSer.listarProductoById(id);
		Producto p2 = new Producto();
		
		p1.setCodigo_productos(p.getCodigo_productos());
		p1.setNombre(p.getNombre());
		p1.setPrecio(p.getPrecio());
		
		p2 = pSer.actualizarProducto(p1);
		return p2;
	}
	
	@DeleteMapping("/productos/{id}")
	public void deleteProductos(@PathVariable(name="id")Integer id) {
		pSer.deleteProducto(id);
	}
}
