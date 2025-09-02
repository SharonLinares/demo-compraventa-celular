package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.CelularDto;
import com.example.demo.dto.CompraDto;

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

	public void createCompra(String usuario, int celular, int cantidad) {

		int numeroCompra = compras.size() + 1;
		CompraDto compra = new CompraDto(numeroCompra, usuario, celular, cantidad);

		boolean compraExiste = false;
		for (CompraDto compra1 : compras) {
			if (compra1.getCelular() == celular && compra1.getUsuario().equals(usuario)) {
				compraExiste = true;
				break;
			}
		}

		if (compraExiste) {
			System.out
					.println("La compra del celular con ID " + celular + " para el usuario " + usuario + " ya existe.");
		} else {
			compras.add(compra);
			System.out.println("Compra creada con éxito: " + compra);
		}
	}

	public void imprimirTodasLasCompras() {
		if (compras.isEmpty()) {
			System.out.println("No hay compras registradas.");
		} else {
			for (CompraDto compra : compras) {
				System.out.println(compra);
			}
		}
	}

		public void imprimirCompraPorNumero(int numeroCompra) {
		CompraDto compra = getByNumeroCompra(numeroCompra);
		if (compra != null) {
			System.out.println(compra);
		} else {
			System.out.println("Compra no encontrada con número: " + numeroCompra);
		}
	}
}