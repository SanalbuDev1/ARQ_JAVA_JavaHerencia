package com.softw.practicando.modulo3.ejempolo002;

public class Deportista extends Persona {

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
