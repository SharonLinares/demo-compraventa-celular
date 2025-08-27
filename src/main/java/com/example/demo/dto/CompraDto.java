package com.example.demo.dto;

public class CompraDto {

	private int numeroCompra;
	private String usuario;
	private int celular;
	private int cantidad;

	public CompraDto() {
		super();
	}

	public CompraDto(int numeroCompra, String usuario, int celular, int cantidad) {
		super();
		this.numeroCompra = numeroCompra;
		this.usuario = usuario;
		this.celular = celular;
		this.cantidad = cantidad;
	}

	public int getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
