package com.softw.practicando.modulo3.ejempolo002;

public class Persona {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public void andar() {
		System.out.println(getNombre() + " camina a 5km/h");
	}
	
}
