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
	

	//constructor
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
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
	/**
	 * Sobreescritura del metodo String
	 */
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimeinto="
				+ fechaNacimeinto + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + (int) (dni ^ (dni >>> 32));
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((fechaNacimeinto == null) ? 0 : fechaNacimeinto.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni != other.dni)
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (fechaNacimeinto == null) {
			if (other.fechaNacimeinto != null)
				return false;
		} else if (!fechaNacimeinto.equals(other.fechaNacimeinto))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
		
}

