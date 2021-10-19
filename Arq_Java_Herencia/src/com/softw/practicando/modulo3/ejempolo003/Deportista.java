package com.softw.practicando.modulo3.ejempolo003;

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
		//metodos de la clase superior y reutilizar el codigo que tenemos
		super.usarAndar();
		System.out.println( " 10km/h");
	}	
	
	@Override
	public String toString() {
		return "Deportista [deporte=" + deporte + ", getNombre()=" + getNombre() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
