package com.softw.practicando.modulo3.ejempolo005;

public class Util {

	public static void main(String[] args) {
		
		//Polimorfismo	
		Persona p1 = new Deportista("Ana");
		
		//Polimorfismo	
		Persona p2 = new Ingeniero("Xavi");

		Deportista d1 = new Deportista("angel");
		
		iniciarCaminoPersona(p1);
		iniciarCaminoPersona(p2);
		iniciarCaminoPersona(d1);
		
	}
	
	public static void iniciarCaminoPersona(Persona p) {		
		p.andar();		
	}
	
}
