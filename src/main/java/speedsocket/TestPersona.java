package speedsocket;

import java.util.Date;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona pesona1 = new Persona( "juan", "clavero", new Date(), 0, 0 );
		System.out.println( pesona1.getName() );
		Persona pesona2 = (Persona)ServiceLocator.getContext().getBean("persona1");
		System.out.println( pesona2.getName() );
		Persona pesona3 = (Persona)ServiceLocator.getContext().getBean("persona1");
		System.out.println( pesona3.getName() );
	}
	 
}
