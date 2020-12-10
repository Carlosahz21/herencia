package com.clearminds.cmh.interfaces;

import com.clearminds.cmh.model.Persona;

public interface ServicioPersona {
	public boolean insertar(Persona persona);
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);
	
}
