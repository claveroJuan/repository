
package speedsocket;

import java.util.Date;


public class Persona {

	private String name;
	private String lastName;
	private Date birthdate;
	private double height;
	private double weight;
	private Sexo sexo;
	
	public Persona() {
		this.name = "";
		this.lastName = "";
		this.birthdate = new Date();
		this.height = 0;
		this.weight = 0;
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
}
