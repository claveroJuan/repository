
package speedsocket.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import speedsocket.core.Equipo;
import speedsocket.core.Jugador;
import speedsocket.dao.DataSingleton;
@Path( "teams" )
public class EquipoRest {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Equipo> listAllTeams(){
		return DataSingleton.getInstance().getTeams();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Equipo findById( @PathParam("oid") String oid ){
	Equipo team = new Equipo(oid);
		for(Equipo t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				return t;
		}
		return null;
	}
	
	
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public void addTeam(Equipo team){
		team.setOid(UUID.randomUUID().toString());
		team.setPlayers( new ArrayList<Jugador>() );
		DataSingleton.getInstance().getTeams().add(team);
	}
	
	
	@PUT
	@Path( "/{oid}/players" )
	@Produces( MediaType.APPLICATION_JSON )
	public void addPlayerTeam(@PathParam("oid") String oid, Jugador player){
		player.setOid(UUID.randomUUID().toString());
		player.setOidCurrentTeam(oid);
		
		DataSingleton.getInstance().getPlayers().add(player);
		
		Equipo team = new Equipo(oid);
		for(Equipo t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				t.getPlayers().add(player);
		}
	}
	
	
	@DELETE
	@Path( "/{oid}/players/{oidPlayer}" )
	@Produces( MediaType.APPLICATION_JSON )
	public void removePlayerTeam(@PathParam("oid") String oid,@PathParam("oidPlayer") String oidPlayer){
		Jugador pla = new Jugador(oidPlayer);
		DataSingleton.getInstance().getPlayers().remove(pla);
		
		Equipo team = new Equipo(oid);
		for(Equipo t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				t.getPlayers().remove(pla);
		}
	}
	

}
