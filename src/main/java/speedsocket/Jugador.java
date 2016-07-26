
package speedsocket;

public class Jugador extends Persona{
	
	private String oid;
	private String oidCurrentTeam;
	private Equipo currentTeam;
	private int number;
	private Posicion posicion;

	
	public Jugador(){
		this.number = 0;
		this.posicion = null;
	}
	
	public Jugador(int number, Posicion posicion) {
		super();
		this.number = number;
		this.posicion = posicion;
	}


	public Jugador(String oid) {
		this.setOid(oid);
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

}
