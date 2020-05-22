package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
	
	//constructores
	/**
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
}
