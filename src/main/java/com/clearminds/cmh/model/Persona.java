package com.clearminds.cmh.model;

public class Persona {
	private String nombre;
	private String apellido;
	private String ciudad;

	public Persona() {
	
	}

	public Persona(String nombre, String apellido, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	
	
}
