package com.example.demo.dto;

public class VentaDto {

	private int numeroVenta;
	private UsuarioDto usuario;
	private PersonaDto persona;
	private CelularDto celular;
	private int cantidad;

	public VentaDto() {
		super();
	}

	public VentaDto(int numeroVenta, UsuarioDto usuario, PersonaDto persona, CelularDto celular, int cantidad) {
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

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public PersonaDto getPersona() {
		return persona;
	}

	public void setPersona(PersonaDto persona) {
		this.persona = persona;
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
