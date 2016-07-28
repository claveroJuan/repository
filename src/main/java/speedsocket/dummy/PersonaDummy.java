package speedsocket.dummy;

import java.sql.SQLException;
import java.util.List;

import speedsocket.core.Jugador;
import speedsocket.core.Persona;
import speedsocket.dao.DataSingleton;
import speedsocket.dao.PersonaDao;
import speedsocket.exception.AutenticacionException;
import speedsocket.exception.CuentaBloqueadaException;

public class PersonaDummy extends PersonaDao {

	@Override
	public List<Persona> getPersona() {
		// TODO Auto-generated method stub
		return DataSingleton.getInstance().getPersonas();
	}

	@Override
	public Persona getPersona(String nombrePersona) {
		// TODO Auto-generated method stub}
		List<Persona> persona = DataSingleton.getInstance().getPersonas();
		for (Persona p : persona) {
			if (persona.equals(p)) {
				return p;
			}

		}
		return null;
	}

	@Override
	public boolean existePersona(String nombrePersona) {
		// TODO Auto-generated method stub
		List<Persona> persona = DataSingleton.getInstance().getPersonas();
		for (Persona p : persona) {
			if (persona.equals(p)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void agregarPersona(Persona persona) {
		// TODO Auto-generated method stub
		DataSingleton.getInstance().getPersonas().add(persona);

	}

	@Override
	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub

		DataSingleton.getInstance().getPersonas().remove(persona);
	}

	@Override
	public void actualizarPersona(Persona persona, Persona pActualizado) {
		// TODO Auto-generated method stub

		List<Persona> personas = DataSingleton.getInstance().getPersonas();
		for (Persona p : personas) {
			if (personas.equals(p)) {
				p = pActualizado;
			}
		}
	}

	@Override
	public boolean login(Persona persona) throws AutenticacionException, CuentaBloqueadaException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
