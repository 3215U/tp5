package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class Usuario {
	private long id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimeinto;
	private String direccion;
	private long dni;
	private LocalDate fechaAlta;
	private String tipo;
	private String password;
	
	//Constructores
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimeinto
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param tipo
	 * @param password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimeinto, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimeinto = fechaNacimeinto;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}
	//Getter and Setter
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimeinto() {
		return fechaNacimeinto;
	}
	public void setFechaNacimeinto(LocalDate fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

