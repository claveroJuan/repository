
package speedsocket.core;

public class Jugador extends Persona{
	
	
	private String oid;
	private String oidCurrentTeam;
	private Equipo currentTeam;
	private int number;
	private Posicion posicion;

	public Jugador(String name) {
		super(name);
	
	}

	
	public Jugador(String name, String pass) {
		super(name, pass);
	
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Posicion getPosition() {
		return posicion;
	}

	public void setPosition(Posicion posicion) {
		this.posicion = posicion;
	}

	
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOidCurrentTeam() {
		return oidCurrentTeam;
	}

	public void setOidCurrentTeam(String oidCurrentTeam) {
		this.oidCurrentTeam = oidCurrentTeam;
	}



	@Override
	public boolean equals(Object object) {
		if( object instanceof Jugador )
			return ((Jugador)object).getOid().equals( this.getOid() );
		return super.equals(object);
	}


	public Equipo getCurrentTeam() {
		return currentTeam;
	}


	public void setCurrentTeam(Equipo currentTeam) {
		this.currentTeam = currentTeam;
	}

	/**
	 * @return the posicion
	 */
	public Posicion getPosicion() {
		return posicion;
	}


	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}
