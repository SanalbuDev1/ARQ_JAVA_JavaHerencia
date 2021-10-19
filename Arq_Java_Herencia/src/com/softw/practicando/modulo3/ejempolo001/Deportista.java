package com.softw.practicando.modulo3.ejempolo001;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Deportista [deporte=" + deporte + ", getNombre()=" + getNombre() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
