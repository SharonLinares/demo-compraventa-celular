package com.example.demo.controller;

import com.example.demo.dto.CelularDto;
import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.CompraService;
import com.example.demo.service.PersonaService;
import com.example.demo.service.UsuarioService;
import com.example.demo.service.VentaService;

public class CompraVentaController {

	public static void main(String[] args) {

		UsuarioService usuarioService = new UsuarioService();
		PersonaService personaService = new PersonaService();
		VentaService ventaService = new VentaService();
		CompraService compraService = new CompraService();

		usuarioService.createUsuario("sharon02", "sharon linares");
		usuarioService.createUsuario("sergio23", " sergio bernal");
		usuarioService.createUsuario("juan", "bernal");

		personaService.createPersona("34gh", "Diego linares", "vip");
		personaService.createPersona("3423ghh", "alberto linares", "invitado");
		personaService.createPersona("323ghh", "jun linares", "premiun");

		CelularDto celular1 = new CelularDto("apple", "iphone 12", 1000);
		CelularDto celular2 = new CelularDto("samsung", "s3", 600);

		UsuarioDto usuario1 = usuarioService.getByCodigo("sharon02");
		UsuarioDto usuario2 = usuarioService.getByCodigo("sergio23");

		PersonaDto persona1 = personaService.getByDocumento("34gh");
		PersonaDto persona2 = personaService.getByDocumento("3423ghh");

		

		compraService.createCompra(usuario1, celular2, 2);
		compraService.createCompra(usuario2, celular1, 4);

		compraService.imprimirTodasLasCompras();
		System.out.println();
		System.out.println("******************imprimiendo por numero de compra******************");
		compraService.imprimirCompraPorNumero(1);
		System.out.println();
		compraService.imprimirCompraPorNumero(2);
		

        ventaService.crearVenta(usuario1, persona1, celular1, 1);
        ventaService.crearVenta(usuario2, persona2, celular2, 3);
        
        
        System.out.println();
        System.out.println("***********lista de ventas***********");
        ventaService.imprimirTodasLasVentas();
        System.out.println("***********venta por numero***********");
        ventaService.imprimirVentaPorNumero(1);
        ventaService.imprimirVentaPorNumero(2);
		

	}

}
