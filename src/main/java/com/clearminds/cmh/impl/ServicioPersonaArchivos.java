package com.clearminds.cmh.impl;

import com.clearminds.cmh.interfaces.ServicioPersona;
import com.clearminds.cmh.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona {
	@Override
	public boolean insertar(Persona persona) {
		System.out.println("insertando persona en un archivo");
		System.out.println(persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en un archivo");
		System.out.println(persona);
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("Actualizando persona en un archivo");
		System.out.println(persona);
		return true;
	}
}
