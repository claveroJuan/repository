package facade;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import speedsocket.core.Persona;
import speedsocket.dao.PersonaDao;
import speedsocket.exception.AutenticacionException;
import speedsocket.exception.CuentaBloqueadaException;

public class PersonaFacade {

	private PersonaDao dao;

	public List<Persona> getPersona() {
		return dao.getPersona();
	}

	public Persona getPersona(String nombrePersona) {
		return dao.getPersona(nombrePersona);
	}

	public void eliminarPersona(String nombrePersona) {
		dao.eliminarPersona(new Persona(nombrePersona));
	}

	public void crearPersona(Persona persona) {

		try {
			if (!dao.existePersona((persona.getName()))) {
				persona.setFechaCreacion(new Date());
				dao.agregarPersona(persona);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public void actualizarPersona(Persona persona, Persona personaActualizado) {
		dao.actualizarPersona(persona, personaActualizado);
	}

	public boolean login(Persona persona) throws AutenticacionException, CuentaBloqueadaException, SQLException {
		if (!(dao.login(persona))) {

			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}

		// TODO Auto-generated method stub

		return false;
	}

	public void actualizarUsuario(Persona persona, Persona persona2) {
		// TODO Auto-generated method stub
		
	}
}
