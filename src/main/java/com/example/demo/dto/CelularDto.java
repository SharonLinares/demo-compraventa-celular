package com.example.demo.dto;

public class CelularDto {

	private String marca;
	private String modelo;
	private int valor;

	public CelularDto() {
		super();
	}

	public CelularDto(String marca, String modelo, int valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
