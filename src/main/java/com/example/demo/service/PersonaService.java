package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas;

	public PersonaService() {
		super();
		this.personas = new ArrayList<>();
	}

	public List<PersonaDto> getAll() {
		return personas;
	}

	public PersonaDto getByDocumento(String documento) {
		for (PersonaDto persona : personas) {
			if (persona.getDocumento().equals(documento)) {
				return persona;
			}
		}
		return null;
	}

	public void createPersona(String documento, String nombreCompleto, String tipoPersona) {

		PersonaDto personaExiste = getByDocumento(documento);
		if (personaExiste == null) {
			PersonaDto persona = new PersonaDto(documento, nombreCompleto, tipoPersona);
			this.personas.add(persona);
		} else {
			System.out.println("ya existe esta persona");

		}

		
		
//		if (getByDocumento(documento) == null) {
//		this.personas.add(new PersonaDto(documento, nombreCompleto, tipoPersona));
//	} else {
//		System.out.println("ya existe esta persona");
//
//	}

		
		
		
//		boolean personaExiste = false;
//
//		for (PersonaDto persona1 : personas) {
//			if (persona1.getDocumento().equals(persona.getDocumento())
//					&& persona1.getNombreCompleto().equals(persona.getNombreCompleto())) {
//				personaExiste = true;
//				break;
//
//			}
//			if (personaExiste) {
//				System.out.println("ya existe la persona");
//			} else {
//				this.personas.add(persona);
//			}
//
//		}
	}

}
