package speedsocket.dummy;

import java.util.List;

import speedsocket.core.Jugador;
import speedsocket.dao.DataSingleton;
import speedsocket.dao.JugadorDao;

public class JugadorDummy extends JugadorDao {

	@Override
	public List<Jugador> getJugadores() {
		// TODO Auto-generated method stub

		return DataSingleton.getInstance().getPlayers();
	}

	@Override
	public Jugador getJugador(String nombreJugador) {
		// TODO Auto-generated method stub
		List<Jugador> jugador = DataSingleton.getInstance().getPlayers();
		for (Jugador j : jugador) {
			if (jugador.equals(j)) {
				return j;
			}

		}
		return null;
	}

	@Override
	public boolean existeJugador(String nombreJugador) {
		// TODO Auto-generated method stub
		List<Jugador> jugador = DataSingleton.getInstance().getPlayers();
		for (Jugador j : jugador) {
			if (jugador.equals(j)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void agregarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		DataSingleton.getInstance().getPlayers().add(jugador);
	}

	@Override
	public void eliminarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		DataSingleton.getInstance().getPlayers().remove(jugador);
	}

	@Override
	public void actualizarJugador(Jugador jugador, Jugador jActualizado) {
		// TODO Auto-generated method stub
		List<Jugador> jugadores = DataSingleton.getInstance().getPlayers();
		for (Jugador j : jugadores) {
			if (jugadores.equals(j)) {
				j = jActualizado;
			} 
		}
	}

}
