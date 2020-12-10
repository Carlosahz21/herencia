package com.clearminds.cmh.model;

import com.clearminds.cmh.impl.ServicioPersonaBDD;
import com.clearminds.cmh.interfaces.ServicioPersona;

public class PersonaManager {
	
	ServicioPersona serv;

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void instanciarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
}
