package com.clearminds.cmh.test;

import com.clearminds.cmh.excepciones.InstanceException;
import com.clearminds.cmh.impl.ServicioPersonaBDD;
import com.clearminds.cmh.model.Persona;
import com.clearminds.cmh.model.PersonaManager;

public class TestManager {
	public static void main(String[] args) throws InstanceException {
		PersonaManager manager;
		try {
			manager = new PersonaManager();
		} catch (InstantiationException e) {
			throw new InstanceException("Error al iniciar la instancia PersonaManager");
		} catch (IllegalAccessException e) {
			throw new InstanceException("Error al iniciar la instancia PersonaManager");
		} catch (ClassNotFoundException e) {
			throw new InstanceException("Error al iniciar la instancia PersonaManager");
			
		}
		

		Persona persona = new Persona("Carlos", "Meneses", "Quito");
		manager.instanciarPersona(persona);

		ServicioPersonaBDD serv = (ServicioPersonaBDD) manager.getServ();
		serv.actualizar(persona);
		serv.eliminar(persona);
	}
}
