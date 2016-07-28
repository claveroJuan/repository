package speedsocket.dao;

import java.sql.SQLException;
import java.util.List;

import speedsocket.core.Persona;
import speedsocket.exception.AutenticacionException;
import speedsocket.exception.CuentaBloqueadaException;

public  abstract class PersonaDao {
	public abstract List<Persona> getPersona();

	public abstract Persona getPersona( String nombrePersona );
	
	public abstract boolean existePersona( String nombrePersona );
	
	public abstract void agregarPersona( Persona persona );
	
	public abstract void eliminarPersona(Persona persona);

	public abstract void actualizarPersona( Persona persona, Persona pActualizado );

	public abstract boolean login(Persona persona) throws AutenticacionException, CuentaBloqueadaException, SQLException;
}
