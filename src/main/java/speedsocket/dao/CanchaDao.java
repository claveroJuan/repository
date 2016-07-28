package speedsocket.dao;

import java.util.List;

import speedsocket.core.Cancha;

public abstract class CanchaDao {



	
	public abstract List<Cancha> getCanchas();

	public abstract Cancha getCanchas( String nombreCancha );
	
	public abstract boolean existeCancha( String nombreCancha );
	
	public abstract void agregarCancha( Cancha cancha );
	
	public abstract void eliminarCancha(Cancha cancha);

	public abstract void actualizarCancha( Cancha cancha, Cancha cActualizado );

	public abstract boolean login(Cancha cancha);

}
