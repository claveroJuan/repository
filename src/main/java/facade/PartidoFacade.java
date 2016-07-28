package facade;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import speedsocket.Partido;
import speedsocket.core.Persona;
import speedsocket.dao.PartidoDao;
import speedsocket.dao.PersonaDao;
import speedsocket.exception.AutenticacionException;
import speedsocket.exception.CuentaBloqueadaException;

public class PartidoFacade {
	private PartidoDao dao;

	public List<Partido> getPartido() {
		return dao.getPartido();
	}

	public Partido getPartido(String nombrePartido) {
		return dao.getPartido(nombrePartido);
	}

	public void eliminarPartido(String nombrePartido) {
		dao.eliminarPartido(new Partido(nombrePartido));
	}

	public void crearPartido(Partido partido) {

		try {
			if (!dao.existePartido((partido.getOid()))) {
				dao.agregarPartido(partido);;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public void actualizarPersona(Partido partido, Partido pActualizado) {
		dao.actualizarPartido(partido, pActualizado);
	}

	

}
