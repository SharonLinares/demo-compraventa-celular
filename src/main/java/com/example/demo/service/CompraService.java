package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.CelularDto;
import com.example.demo.dto.CompraDto;
import com.example.demo.dto.UsuarioDto;

public class CompraService {

	private List<CompraDto> compras;

	public CompraService() {
		super();
		this.compras = new ArrayList<>();
	}

	public List<CompraDto> getAll() {
		return compras;

	}

	public void crearCompra(CompraDto compra) {
		compras.add(compra);
	}

	public CompraDto getByNumeroCompra(int numeroCompra) {
		for (CompraDto compra : compras) {
			if (compra.getNumeroCompra() == numeroCompra) {
				return compra;
			}
		}
		return null;
	}

	public void createCompra(UsuarioDto usuario, CelularDto celular, int cantidad) {

		int numeroCompra = compras.size() + 1;
		CompraDto compra = new CompraDto(numeroCompra, usuario, celular, cantidad);
		compras.add(compra);

	}

	public CompraDto consultarbyMarcaModelo(String marca, String modelo) {
		for (CompraDto compra : compras) {
			CelularDto celular = compra.getCelular();
			if (celular.getMarca().equals(marca) && celular.getModelo().equals(modelo)) {
				return compra;
			}
		}
		return null;
	}

	public void imprimirTodasLasCompras() {
		if (compras.isEmpty()) {
			System.out.println("No hay compras registradas.");
		} else {
			for (CompraDto compra : compras) {
				imprimirCompra(compra);
				System.out.println();

			}
		}
	}

	public void imprimirCompraPorNumero(int numeroCompra) {
		CompraDto compra = getByNumeroCompra(numeroCompra);
		if (compra == null) {
			System.out.println("Compra no encontrada con número: " + numeroCompra);
		} else {
			imprimirCompra(compra);
			System.out.println();
		}
	}

	public void imprimirCompra(CompraDto compra) {
		UsuarioDto usuario = compra.getUsuario();
		System.out.println("el usuario es: " + usuario.getNombreCompleto());
		System.out.println("el codigo del usuario es: " + usuario.getCodigo());
		CelularDto celular = compra.getCelular();
		System.out.println("el celular es: " + celular.getMarca());
		System.out.println("el Modelo es: " + celular.getModelo());
		System.out.println("el Valor es: " + celular.getValor());
		System.out.println("la cantidad es: " + compra.getCantidad());
		System.out.println("el numero de compra es: " + compra.getNumeroCompra());
	}

}