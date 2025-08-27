package com.example.demo.dto;

public class VentaDto {

	private int numeroVenta;
	private String usuario;
	private String persona;
	private int celular;
	private int cantidad;

	public VentaDto() {
		super();
	}

	public VentaDto(int numeroVenta, String usuario, String persona, int celular, int cantidad) {
		super();
		this.numeroVenta = numeroVenta;
		this.usuario = usuario;
		this.persona = persona;
		this.celular = celular;
		this.cantidad = cantidad;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
