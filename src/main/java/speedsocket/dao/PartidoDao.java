package speedsocket.dao;

import java.util.List;

import speedsocket.Partido;

public abstract class PartidoDao {

	public abstract List<Partido> getPartido();

	public abstract Partido getPartido(String nombrePartido);

	public abstract boolean existePartido(String nombrePartido);

	public abstract void agregarPartido(Partido partido);

	public abstract void eliminarPartido(Partido partido);

	public abstract void actualizarPartido(Partido partido, Partido pActualizado);
}
