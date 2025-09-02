package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.UsuarioDto;

public class UsuarioService {

	private List<UsuarioDto> usuarios;

	public UsuarioService() {
		super();
		this.usuarios = new ArrayList<>();
	}

	public List<UsuarioDto> getAll() {
		return usuarios;
	}

	public UsuarioDto getByCodigo(int codigo) {
		for (UsuarioDto usuario : usuarios) {
			if (usuario.getCodigo().equals(codigo)) {
				return usuario;
			}
		}
		return null;

	}

	public void createUsuario(String codigo, String nombreCompleto) {
		UsuarioDto usuario = new UsuarioDto(codigo, nombreCompleto);

		boolean existeUsuario = false;
		for (UsuarioDto usuario1 : usuarios) {
			if (usuario.getCodigo().equals(usuario1.getCodigo())
					&& usuario.getNombreCompleto().equals(usuario1.getNombreCompleto())) {
				existeUsuario = true;
				break;
			}
		}
		if (existeUsuario) {
			System.out.println("ya existe");

		} else {
			usuarios.add(usuario);
		}

	}

}
