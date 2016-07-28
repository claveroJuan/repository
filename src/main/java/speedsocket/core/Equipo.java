
package speedsocket.core;

import java.util.Date;
import java.util.List;

public class Equipo {

	private String oid;
	private String name;
	private String bio;
	private Sexo sexo;
	private List<Jugador> jugadores;
	private Date fechaCreacion;

	private EquipoCategoria category;

	public Equipo() {
		this.name = "";
		this.jugadores = null;
	}

	public Equipo(String oid) {
		this.oid = oid;
	}

	public Equipo(String name, List<Jugador> jugadores) {
		this.name = name;
		this.jugadores = jugadores;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Jugador> getPlayers() {
		return jugadores;
	}

	public void setPlayers(List<Jugador> jugadors) {
		this.jugadores = jugadors;
	}

	public Sexo getGender() {
		return sexo;
	}

	public void setGender(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public EquipoCategoria getCategory() {
		return category;
	}

	public void setCategory(EquipoCategoria category) {
		this.category = category;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equipo) {
			return ((Equipo) obj).getOid().equals(this.getOid());
		}
		return super.equals(obj);
	}

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the jugadores
	 */
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	/**
	 * @param jugadores
	 *            the jugadores to set
	 */
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
