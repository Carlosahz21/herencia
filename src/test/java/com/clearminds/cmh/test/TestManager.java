package com.clearminds.cmh.test;

import com.clearminds.cmh.impl.ServicioPersonaBDD;
import com.clearminds.cmh.model.Persona;
import com.clearminds.cmh.model.PersonaManager;

public class TestManager {
	public static void main(String[] args) {
		PersonaManager manager = new PersonaManager();
		Persona persona = new Persona("Carlos", "Meneses", "Quito");
		manager.instanciarPersona(persona);

		ServicioPersonaBDD serv = (ServicioPersonaBDD) manager.getServ();
		serv.actualizar(persona);
		serv.eliminar(persona);
	}
}
