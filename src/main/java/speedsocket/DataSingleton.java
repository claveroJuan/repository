
package speedsocket;

import java.util.ArrayList;
import java.util.List;
public class DataSingleton {
	
	private List<Equipo> teams;
	private List<Jugador> players;
	private List<Partido> matches;
	private List<Cancha> canchas;
	private static DataSingleton _instance;
	
	//constructor privado 
	
	private DataSingleton(){
		teams = new ArrayList<Equipo>();
		players = new ArrayList<Jugador>();
		matches = new ArrayList<Partido>();
		canchas = new ArrayList<Cancha>();
		
	}
	
	public static DataSingleton getInstance(){
		if(null == _instance){
			_instance = new DataSingleton();
		}
		return _instance;
	}


	public List<Equipo> getTeams() {
		return teams;
	}


	public void setTeams(List<Equipo> teams) {
		this.teams = teams;
	}

	
	public List<Jugador> getPlayers() {
		return players;
	}

	
	public void setPlayers(List<Jugador> players) {
		this.players = players;
	}

	
	public List<Partido> getMatches() {
		return matches;
	}

	
	public void setMatches(List<Partido> matches) {
		this.matches = matches;
	}

	/**
	 * @return the canchas
	 */
	public List<Cancha> getCanchas() {
		return canchas;
	}

	/**
	 * @param canchas the canchas to set
	 */
	public void setCanchas(List<Cancha> canchas) {
		this.canchas = canchas;
	}

	

}
