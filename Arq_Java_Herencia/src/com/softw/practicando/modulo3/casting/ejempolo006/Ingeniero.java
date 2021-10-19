package com.softw.practicando.modulo3.casting.ejempolo006;

public class Ingeniero extends Persona {

	public Ingeniero(String nombre) {
		super(nombre);		
	}

	@Override
	public void andar() {
		System.out.println(getNombre() + " camina a 4km/h");
	}
	

}
