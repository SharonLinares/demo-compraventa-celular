package com.example.demo.service;

import com.example.demo.dto.VentaDto;
import java.util.ArrayList;
import java.util.List;

public class VentaService {

	private List<VentaDto> ventas;

	public VentaService() {
		this.ventas = new ArrayList<>();
	}

	public List<VentaDto> getAll() {
		return ventas;
	}

	public VentaDto imprimirNumeroVenta(int numeroVenta) {
		for (VentaDto venta : ventas) {
			if (venta.getNumeroVenta() == numeroVenta) {
				return venta;
			}
		}
		return null;
	}

	public List<VentaDto> todasLasVentas() {
		return ventas;
	}

	public void crearVenta(String usuario, String persona, int celular, int cantidad) {

		int numeroVenta = ventas.size() + 1;
		VentaDto venta = new VentaDto(numeroVenta, usuario, persona, celular, cantidad);

		boolean ventaExiste = false;
		for (VentaDto v : ventas) {
			if (v.getCelular() == celular && v.getUsuario().equals(usuario)) {
				ventaExiste = true;
				break;
			}
		}

		if (ventaExiste) {
			System.out
					.println("La venta del celular con ID " + celular + " para el usuario " + usuario + " ya existe.");
		} else {
			ventas.add(venta);
			System.out.println("Venta creada con éxito: " + venta);
		}
	}
	
	public void imprimirVentasPorDocumento(String documento) {
	    boolean ventasEncontradas = false;

	    for (VentaDto venta : ventas) {
	        if (venta.getPersona().equals(documento)) {
	            System.out.println(venta);
	            ventasEncontradas = true;
	        }
	    }

	    if (!ventasEncontradas) {
	        System.out.println("No se encontraron ventas para el documento: " + documento);
	    }
	}

}
