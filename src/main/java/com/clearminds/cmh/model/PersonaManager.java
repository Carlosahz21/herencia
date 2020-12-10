package com.clearminds.cmh.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.cmh.interfaces.ServicioPersona;

public class PersonaManager {
	
	ServicioPersona serv;

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

	public PersonaManager() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Class<?> clase = Class.forName(leerPropiedad("clase"));
		serv = (ServicioPersona) clase.newInstance();
		
	}
	
	public void instanciarPersona(Persona persona) {
		serv.insertar(persona);
	}
	
	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return p.getProperty(propiedad);
	}
}
