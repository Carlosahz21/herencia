package com.clearminds.cmh.test;

import com.clearminds.cmh.excepciones.InstanceException;
import com.clearminds.cmh.interfaces.ServicioPersona;
import com.clearminds.cmh.model.Persona;
import com.clearminds.cmh.model.PersonaManager;

public class TestManager {
	public static void main(String[] args) throws InstanceException {
		PersonaManager manager = new PersonaManager();
		
		Persona persona = new Persona("Carlos", "Meneses", "Quito");
		manager.instanciarPersona(persona);

		ServicioPersona serv = manager.getServ();
		serv.actualizar(persona);
		serv.eliminar(persona);
	}
}
