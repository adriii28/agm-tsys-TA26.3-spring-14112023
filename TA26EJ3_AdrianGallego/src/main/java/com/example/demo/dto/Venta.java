package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="cajero_id")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name="maquina_id")
	private MaquinaRegistradora maquina_reguistradora;

	public Venta() {

	}
	
	public Venta(int id, Producto producto, Cajero cajero, MaquinaRegistradora maquina_reguistradora) {
		this.id = id;
		this.producto = producto;
		this.cajero = cajero;
		this.maquina_reguistradora = maquina_reguistradora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquina_reguistradora() {
		return maquina_reguistradora;
	}

	public void setMaquina_reguistradora(MaquinaRegistradora maquina_reguistradora) {
		this.maquina_reguistradora = maquina_reguistradora;
	}

}
