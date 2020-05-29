/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Benicio3215Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Benicio Roxana
 *
 */

@Repository

public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Benicio3215Tp5Application.class);
	
	@Override
	public void guardar() {
		// aacion ejecutada para guardar un objeto usuario en la BD;
		LOG.info("El usuario fue guardado "+ usuario.getApellido() + " , "+usuario.getNombre()+" fue guardado con EXITO");
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos de los usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto de la bd
		LOG.info("Se elimino el usuario bd");
	}

	@Override
	public Usuario modificar() {
		//se modifico el objeto de la bd
//		LOG.info("Se modifico el usuario bd "+ usuario.getApellido() + " , "+usuario.getNombre());
		return usuario;
	}

}
