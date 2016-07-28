
package speedsocket.core;

import java.util.Date;


public class Persona {

	
	
	private String name;
	private String lastName;
	private Date birthdate;
	private Date fechaCreacion;
	private double height;
	private double weight;
	private Sexo sexo;
	
	private String pass;
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Persona ){
			return ((Persona)obj).getName().equals(this.getName());
		}
		return super.equals(obj);
	}
	
	public Persona(String nombre, String pass) {
		this.name = nombre;
		this.pass=pass;
	
	
	}
	
	public Persona(String name, String lastName, Date birthdate, double height,
			double weight) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.height = height;
		this.weight = weight;
	}
	
	public Persona(String name2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Sexo getGender() {
		return sexo;
	}

	public void setGender(Sexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
