package com.clearminds.cmh.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.cmh.excepciones.InstanceException;
import com.clearminds.cmh.interfaces.ServicioPersona;

public class PersonaManager {
	
	ServicioPersona serv;

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

	public PersonaManager() throws InstanceException {

		Class<?> clase;
		
		try {
			
			clase = Class.forName(leerPropiedad("claseBDD"));
			serv = (ServicioPersona) clase.newInstance();
			
		} catch (ClassNotFoundException e) {
			throw new InstanceException("Error al iniciar la instancia PersonaManager");
		} catch (InstantiationException e) {
			throw new InstanceException("Error al iniciarl la instancia PersonaManager");
		} catch (IllegalAccessException e) {
			throw new InstanceException("Error al iniciarl la instancia PersonaManager");
		}
		
		
		
	}
	
	public void instanciarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return p.getProperty(propiedad);
	}
}
