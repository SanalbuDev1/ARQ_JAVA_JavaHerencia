package com.softw.practicando.modulo3.ejempolo004;

public class Util {

	public static void main(String[] args) {

		Persona p1 = new Persona("pedro");
		p1.andar();		

		Deportista d1 = new Deportista("Santiago");
		d1.setDeporte("Gym");
		d1.andar();		

		Persona p3 = new Deportista("Ana");
		p3.andar();

	}

}
