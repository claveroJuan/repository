package facade;

import java.util.Date;
import java.util.List;

import speedsocket.core.Equipo;
import speedsocket.dao.EquipoDao;


public class EquipoFacade {
	private EquipoDao dao;

	public List<Equipo> getEquipo() {
		return dao.getEquipo();
	}

	public Equipo getEquipo(String nombreEquipo) {
		return dao.getEquipo(nombreEquipo);
	}

	public void eliminarEquipo(String nombreEquipo) {
		dao.eliminarEquipo(new Equipo(nombreEquipo));
	}

	public void crearEquipo(Equipo equipo) {

		try {
			if (!dao.existeEquipo((equipo.getName()))) {
				equipo.setFechaCreacion((new Date()));
				dao.agregarEquipo(equipo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public void actualizarEquipo(Equipo equipo, Equipo eActualizado) {
		dao.actualizarEquipo(equipo, eActualizado);
	}
}
