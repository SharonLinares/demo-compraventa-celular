package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.CelularDto;
import com.example.demo.dto.CompraDto;
import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.dto.VentaDto;

public class VentaService {

	private List<VentaDto> ventas;

	public VentaService() {
		super();
		this.ventas = new ArrayList<>();
	}

	public List<VentaDto> getAll() {
		return ventas;
	}

	public VentaDto obtenerVentaPorNumero(int numeroVenta) {
		for (VentaDto venta : ventas) {
			if (venta.getNumeroVenta() == numeroVenta) {
				return venta;

			}
		}
		return null;
	}

	public void crearVenta(UsuarioDto usuarioDto, PersonaDto personaDto, CelularDto celularDto, int cantidad) {

		int numeroVenta = ventas.size() + 1;
		VentaDto venta = new VentaDto(numeroVenta, usuarioDto, personaDto, celularDto, cantidad);
		this.ventas.add(venta);

	}

	public VentaDto consultarPorMarcaYmodelo(String marca, String modelo) {
		for (VentaDto venta : ventas) {
			CelularDto celular = venta.getCelular();
			if (celular.getMarca().equals(marca) && celular.getModelo().equals(modelo)) {
				return venta;
			}
		}
		return null;

	}

	public void imprimirventa(VentaDto venta) {

		UsuarioDto usuario = venta.getUsuario();
		System.out.println("el usuario es: " + usuario.getNombreCompleto());
		System.out.println("el codigo del usuario es: " + usuario.getCodigo());
		PersonaDto persona = venta.getPersona();
		System.out.println("la persona  es: " + persona.getNombreCompleto());
		System.out.println("el codigo del usuario es: " + persona.getDocumento());
		CelularDto celular = venta.getCelular();
		System.out.println("el celular es: " + celular.getMarca());
		System.out.println("el Modelo es: " + celular.getModelo());
		System.out.println("el Valor es: " + celular.getValor());
		System.out.println("la cantidad es: " + venta.getCantidad());
		System.out.println("el numero de compra es: " + venta.getNumeroVenta());

	}

	public void imprimirTodasLasVentas() {
		if (ventas.isEmpty()) {
			System.out.println("No hay ventas registradas.");
		} else {
			for (VentaDto venta : ventas) {
				imprimirventa(venta);
				System.out.println();

			}
		}
	}

	public void imprimirVentaPorNumero(int numeroVenta) {
		VentaDto venta = obtenerVentaPorNumero(numeroVenta);
		if (venta == null) {
			System.out.println("venta no encontrada con numero: " + numeroVenta);
		} else {
			imprimirventa(venta);
			System.out.println();
		}
	}

}
