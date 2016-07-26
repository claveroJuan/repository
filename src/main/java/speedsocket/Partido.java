
package speedsocket;

import java.util.Date;

public class Partido {

	private String oid;
	private Date date;
	private Equipo visitor;
	private Equipo local;
	private int puntosVisitor;
	private int puntosLocal;
	

	
	
	public Partido(){
	}

	public Partido(String oid) {
		this.oid = oid;
	}
 
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Equipo getVisitor() {
		return visitor;
	}

	public void setVisitor(Equipo visitor) {
		this.visitor = visitor;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}


	
	
	@Override
	public boolean equals(Object object) {
		if( object instanceof Partido )
			return ((Partido)object).getOid().equals( this.getOid() );
		return super.equals(object);
	}

	/**
	 * @return the puntosVisitor
	 */
	public int getPuntosVisitor() {
		return puntosVisitor;
	}

	/**
	 * @param puntosVisitor the puntosVisitor to set
	 */
	public void setPuntosVisitor(int puntosVisitor) {
		this.puntosVisitor = puntosVisitor;
	}

	/**
	 * @return the puntosLocal
	 */
	public int getPuntosLocal() {
		return puntosLocal;
	}

	/**
	 * @param puntosLocal the puntosLocal to set
	 */
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	
}
