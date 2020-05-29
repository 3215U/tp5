package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cuota {
	private long id;
	private LocalDate fechaPago;
	private String periodo;
	private double monto;
	private String estado;
	@Autowired
	private Usuario usuario;
	
	//constructor
	public Cuota() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructores
	/**
	 * @param id
	 * @param fechaPago
	 * @param periodo
	 * @param monto
	 * @param estado
	 * @param usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		super();
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}
	//Getter and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * Sobreescritura del metodo String
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaPago == null) ? 0 : fechaPago.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(monto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Cuota other = (Cuota) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaPago == null) {
			if (other.fechaPago != null)
				return false;
		} else if (!fechaPago.equals(other.fechaPago))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(monto) != Double.doubleToLongBits(other.monto))
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	
}
