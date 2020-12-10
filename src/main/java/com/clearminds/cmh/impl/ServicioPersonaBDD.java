package com.clearminds.cmh.impl;

import com.clearminds.cmh.interfaces.ServicioPersona;
import com.clearminds.cmh.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	@Override
	public boolean insertar(Persona persona) {
		System.out.println("insertando persona en la bdd");
		System.out.println(persona);
		return true;
	}

	@Override
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la bdd");
		System.out.println(persona);
		return true;
	}

	@Override
	public boolean eliminar(Persona persona) {
		System.out.println("Actualizando persona en la bdd");
		System.out.println(persona);
		return true;
	}
	
}
