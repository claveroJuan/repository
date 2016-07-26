
package speedsocket;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path( "players" )
public class JugadorRest {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Jugador> listAll(){
		return DataSingleton.getInstance().getPlayers();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Jugador findById( @PathParam("oid") String oid ){
		Jugador player = new Jugador(oid);
		for(Jugador p : DataSingleton.getInstance().getPlayers() ){
			if(p.equals( player ) )
				player = p;
		}
		
		Equipo team = new Equipo( player.getOidCurrentTeam() );
		for(Equipo t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				player.setCurrentTeam(team);
		}
		
		return player;
	}

}
