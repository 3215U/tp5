package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Usuario;
@Repository("usuarioImp")

public class UsuarioImp implements IUsuario {
	
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG =LoggerFactory.getLogger(Benicio3215Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un obeto usuario en la BD
		LOG.info("El usuario fue guardado " + usuario.getApellido() +", "+usuario.getNombre());
		

	}

	@Override
	public Usuario mostrar() {
		// se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// se elimina el obeto usuario de la bd
		LOG.info("Se eliminó el usuario de la bd");
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
