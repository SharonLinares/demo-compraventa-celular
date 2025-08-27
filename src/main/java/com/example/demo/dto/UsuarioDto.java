package com.example.demo.dto;

public class UsuarioDto {

	private String codigo;
	private String nombreCompleto;

	public UsuarioDto() {
		super();
	}

	public UsuarioDto(String codigo, String nombreCompleto) {
		super();
		this.codigo = codigo;
		this.nombreCompleto = nombreCompleto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
