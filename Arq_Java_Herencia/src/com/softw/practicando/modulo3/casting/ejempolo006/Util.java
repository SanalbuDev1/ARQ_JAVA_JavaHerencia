package com.softw.practicando.modulo3.casting.ejempolo006;

public class Util {

	public static void main(String[] args) {
		
		//Polimorfismo	
		Persona p1 = new Deportista("Ana","Futbol");
		System.out.println(p1.getNombre());
		p1.andar();
		
		Deportista d = (Deportista) p1;
		System.out.println(d.getDeporte());
		
		
	}	
}
