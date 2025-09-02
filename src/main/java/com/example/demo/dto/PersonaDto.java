package com.example.demo.dto;

public class PersonaDto {

	private String documento;
	private String nombreCompleto;
	private String tipoPersona; 

	public PersonaDto() {
		super();
	}

	public PersonaDto(String documento, String nombreCompleto, String tipoPersona) {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
		this.tipoPersona = tipoPersona;
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

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}
