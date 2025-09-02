package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.CelularDto;
import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.dto.VentaDto;

public class VentaService {

	private List<VentaDto> ventas;

	public VentaService() {
		super();
		this.ventas = new ArrayList<>();

	}

	public void crearVenta(UsuarioDto usuario, PersonaDto persona, CelularDto celular, int cantidad) {

		int numeroVenta = ventas.size() + 1;
		VentaDto venta = new VentaDto(numeroVenta, usuario, persona, celular, cantidad);
		this.ventas.add(venta);
	}

	public VentaDto consultarVentaPorMarcaYmodelo(String marca, String modelo) {
		for (VentaDto venta : ventas) {
			if (venta.getCelular().getMarca().equals(marca) && venta.getCelular().getModelo().equals(modelo)) {
				return venta;
			}
		}
		return null;

	}

	public List<VentaDto> totalVentas() {
		return ventas;
	}

	public VentaDto consultarPornumeroVenta(int numeroVenta) {
		for (VentaDto venta : ventas) {
			if (venta.getNumeroVenta() == numeroVenta) {
				return venta;
			}
		}
		return null;
	}

	public VentaDto imprimirTodasLasVentasbyDocumento(String documento) {
		for (VentaDto venta : ventas) {
			if (venta.getPersona().getDocumento().equals(documento)) {
				return venta;
			}
		}
		return null;
	}

}
