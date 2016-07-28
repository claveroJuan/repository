package speedsocket.dao;

import java.util.List;

import speedsocket.core.Equipo;

public abstract class EquipoDao {


	
	public abstract List<Equipo> getEquipo();

	public abstract Equipo getEquipo( String nombreEquipo );
	
	public abstract boolean existeEquipo( String nombreEquipo );
	
	public abstract void agregarEquipo( Equipo equipo );
	
	public abstract void eliminarEquipo(Equipo equipo);

	public abstract void actualizarEquipo( Equipo equipo, Equipo eActualizado );
}
