package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
	
	//constructor
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	//constructores
	/**
	 * @param nombre
	 * @param estadio
	 */
	@Autowired
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
	/**
	 * Sobreescritura del metodo String
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}
