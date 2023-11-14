package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="maquinas_registradoras")
public class MaquinaRegistradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_maquina;
	private int piso;
	
	@OneToMany
    @JoinColumn(name="maquina_id")
	private List<Venta> Venta;
	
	public MaquinaRegistradora() {
	}

	public MaquinaRegistradora(int codigo_maquina, int piso, List<com.example.demo.dto.Venta> venta) {
		super();
		this.codigo_maquina = codigo_maquina;
		this.piso = piso;
		Venta = venta;
	}

	public int getCodigo_maquina() {
		return codigo_maquina;
	}

	public void setCodigo_maquina(int codigo_maquina) {
		this.codigo_maquina = codigo_maquina;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return Venta;
	}

	public void setVenta(List<Venta> venta) {
		Venta = venta;
	}

	
	
}
