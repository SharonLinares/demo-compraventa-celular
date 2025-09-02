package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.*;

public class CompraVentaController {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        PersonaService personaService = new PersonaService();
        CompraService compraService = new CompraService();
        VentaService ventaService = new VentaService();


        usuarioService.createUsuario("U1", "Carlos Perez");
        usuarioService.createUsuario("U2", "Laura Diaz");

       
        personaService.createPersona("123", "Juan Gomez", "PREMIUM");
        personaService.createPersona("456", "Ana Torres", "VIP");

  
        CelularDto celular1 = new CelularDto();
        celular1.setMarca("Samsung");
        celular1.setModelo("A54");
        celular1.setValor(1200);

        CelularDto celular2 = new CelularDto();
        celular2.setMarca("Apple");
        celular2.setModelo("iPhone 13");
        celular2.setValor(2500);

    
        CompraDto compra1 = new CompraDto();
        compra1.setNumeroCompra(001);
        compra1.setUsuario(usuarioService.getByCodigo(1123).getNombreCompleto());
        compra1.setCelular(celular1.getValor());
        compra1.setCantidad(2);
        compraService.crearCompra(compra1);

       
        VentaDto venta1 = new VentaDto();
        venta1.setNumeroVenta("V001");
        venta1.setUsuario(usuarioService.getByCodigo("U2"));
        venta1.setPersona(personaService.getByDocumento("456"));
        venta1.setCelular(celular2);
        venta1.setCantidad(1);
        ventaService.crearVenta(venta1);

  
 
    }
}