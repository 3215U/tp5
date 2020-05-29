package ar.edu.unju.fi.model;

/**
 * 
 * @author Benicio Roxana
 *
 */
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Estadio {
	private String nombre;
	private LocalDate fechaFundacion;
	private String ciudad;
	private int capacidad;
	private String direccion;
	
	//constructor
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	//Constructor
	/**
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		super();
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	//Metodo getteres and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Sobreescritura del metodo String
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidad;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((fechaFundacion == null) ? 0 : fechaFundacion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estadio other = (Estadio) obj;
		if (capacidad != other.capacidad)
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (fechaFundacion == null) {
			if (other.fechaFundacion != null)
				return false;
		} else if (!fechaFundacion.equals(other.fechaFundacion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}
