package com.softw.practicando.modulo3.ejempolo002;

public class Util {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("pedro");
		p1.andar();
		
		Deportista d1 = new Deportista();
		d1.setNombre("Santiago");
		d1.setDeporte("Gym");	
		d1.andar();
		
		Persona p3 = new Deportista();
		p3.setNombre("Ana");
		p3.andar();		
		
	}
	
}
