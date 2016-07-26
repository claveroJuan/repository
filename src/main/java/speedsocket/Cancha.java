package speedsocket;

public class Cancha {
	
	private String oid;
	private String oidCurrentTeam;
	private Comuna currentComuna;
	private int contacto;
	private String direccion;
	private String categoria;


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
/**
 * @return the oidCurrentTeam
 */
public String getOidCurrentTeam() {
	return oidCurrentTeam;
}
/**
 * @param oidCurrentTeam the oidCurrentTeam to set
 */
public void setOidCurrentTeam(String oidCurrentTeam) {
	this.oidCurrentTeam = oidCurrentTeam;
}
/**
 * @return the currentComuna
 */
public Comuna getCurrentComuna() {
	return currentComuna;
}
/**
 * @param currentComuna the currentComuna to set
 */
public void setCurrentComuna(Comuna currentComuna) {
	this.currentComuna = currentComuna;
}
/**
 * @return the contacto
 */
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
public void setOid(String oid) {
	this.oid = oid;
}
/**
 * @param oid
 * @param oidCurrentTeam
 * @param currentComuna
 * @param contacto
 * @param direccion
 */
public Cancha(String oid, String oidCurrentTeam, Comuna currentComuna, int contacto, String direccion) {
	super();
	this.oid = oid;
	this.oidCurrentTeam = oidCurrentTeam;
	this.currentComuna = currentComuna;
	this.contacto = contacto;
	this.direccion = direccion;
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





}