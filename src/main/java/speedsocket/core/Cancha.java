package speedsocket.core;

import java.util.List;

public class Cancha {
	
	private String oid;
	
	private Comuna comuna;
	private int contacto;
	private String direccion;
	private String categoria;
	private List<Cancha> canchas;



@Override
public boolean equals(Object object) {
	if( object instanceof Cancha )
		return ((Cancha)object).getOid().equals( this.getOid() );
	return super.equals(object);
}
private Object getOid() {
	// TODO Auto-generated method stub
	return null;
}

public int getContacto() {
	return contacto;
}
/**
 * @param contacto the contacto to set
 */
public void setContacto(int contacto) {
	this.contacto = contacto;
}
/**
 * @return the direccion
 */
public String getDireccion() {
	return direccion;
}
/**
 * @param direccion the direccion to set
 */
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
/**
 * @param oid the oid to set
 */

/**
 * @param oid
 * @param oidCurrentTeam
 * @param currentComuna
 * @param contacto
 * @param direccion
 */
public Cancha(String oid, String oidCurrentTeam, Comuna currentComuna, int contacto, String direccion, List<Cancha> canchas) {
	super();
	this.oid = oid;
	this.comuna = currentComuna;
	this.contacto = contacto;
	this.direccion = direccion;
	this.canchas=canchas;
}
public Cancha(String oidCancha) {
	// TODO Auto-generated constructor stub
	this.oid=oidCancha;
}
/**
 * @return the categoria
 */
public String getCategoria() {
	return categoria;
}
/**
 * @param categoria the categoria to set
 */
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
/**
 * @return the comuna
 */
public Comuna getComuna() {
	return comuna;
}
/**
 * @param comuna the comuna to set
 */
public void setComuna(Comuna comuna) {
	this.comuna = comuna;
}
/**
 * @param oid the oid to set
 */
public void setOid(String oid) {
	this.oid = oid;
}
public List<Cancha> getCanchas() {
	// TODO Auto-generated method stub
	return null;
}
/**
 * @param canchas the canchas to set
 */
public void setCanchas(List<Cancha> canchas) {
	this.canchas = canchas;
}





}