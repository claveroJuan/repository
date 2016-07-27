package speedsocket.dao;

import java.util.List;

import speedsocket.core.Jugador;

public abstract class JugadorDao {

	public abstract List<Jugador> getJugadores();

	public abstract Jugador getJugador(String nombreJugador);

	public abstract boolean existeJugador(String nombreJugador);

	public abstract void agregarJugador(Jugador jugador);

	public abstract void eliminarJugador(Jugador jugador);

	public abstract void actualizarJugador(Jugador jugador, Jugador jActualizado);
}
