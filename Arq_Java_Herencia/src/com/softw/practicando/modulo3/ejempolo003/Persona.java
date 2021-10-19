package com.softw.practicando.modulo3.ejempolo003;

public class Persona {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public void andar() {
		usarAndar();
		System.out.print(" 5km/h" + "\n");
	}
	
	void usarAndar() {
		System.out.print(getNombre() + " camina a");
	}
	
}
