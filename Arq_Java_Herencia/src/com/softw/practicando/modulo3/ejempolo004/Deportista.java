package com.softw.practicando.modulo3.ejempolo004;

public class Deportista extends Persona {

	public Deportista(String nombre) {
		super(nombre);			
	}

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	@Override
	public void andar() {
		System.out.println(getNombre() +" anda a 10km/h");
	}	

	@Override
	public String toString() {
		return "Deportista [deporte=" + deporte + ", getNombre()=" + getNombre() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
