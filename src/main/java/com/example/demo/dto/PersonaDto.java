package com.example.demo.dto;

public class PersonaDto {

	private String documento;
	private String nombreCompleto;

	public PersonaDto() {
		super();
	}

	public PersonaDto(String documento, String nombreCompleto) {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
