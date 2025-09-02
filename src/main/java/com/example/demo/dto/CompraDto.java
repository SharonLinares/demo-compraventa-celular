package com.example.demo.dto;

public class CompraDto {

	private int numeroCompra;
	private UsuarioDto usuario;
	private CelularDto celular;
	private int cantidad;

	public CompraDto() {
		super();
	}

	public CompraDto(int numeroCompra, UsuarioDto usuario, CelularDto celular, int cantidad) {
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

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public CelularDto getCelular() {
		return celular;
	}

	public void setCelular(CelularDto celular) {
		this.celular = celular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
