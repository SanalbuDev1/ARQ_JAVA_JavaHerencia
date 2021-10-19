package com.softw.practicando.modulo3.ejempolo001;

public class Util {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista();
		d1.setNombre("Santiago");
		d1.setDeporte("Gym");
		
		Deportista d2 = new Deportista();
		d2 = d1;
		d2.setDeporte("gym cambiado");
		
		Deportista d3 = new Deportista();
		d2 = null;
		d3.setNombre("Santiago");
		d3.setDeporte("gym cambiado");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
	
}
