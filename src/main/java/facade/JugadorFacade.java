package facade;

import java.util.Date;
import java.util.List;

import speedsocket.core.Jugador;
import speedsocket.dao.JugadorDao;

public class JugadorFacade {

	private JugadorDao dao;

	public List<Jugador> getJugador() {
		return dao.getJugadores();
	}

	public Jugador getJugador(String nombreJugador) {
		return dao.getJugador(nombreJugador);
	}

	public void eliminarJugador(String nombreJugador) {
		dao.eliminarJugador(new Jugador(nombreJugador));
	}

	public void crearJugador(Jugador jugador) {

		try {
			if (!dao.existeJugador((jugador.getName()))) {
				jugador.setFechaCreacion(new Date());
				dao.agregarJugador(jugador);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public void actualizarJugador(Jugador jugador, Jugador jActualizado) {
		dao.actualizarJugador(jugador, jActualizado);
	}

}
