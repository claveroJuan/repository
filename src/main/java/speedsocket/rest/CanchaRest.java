package speedsocket.rest;


import java.util.List;
import java.util.UUID;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import speedsocket.core.Cancha;
import speedsocket.core.Equipo;
import speedsocket.dao.DataSingleton;

@Path("canchas")
public class CanchaRest {

	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Cancha> listAllCanchas(){
		return DataSingleton.getInstance().getCanchas();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Cancha findById( @PathParam("oid") String oid ){
	Equipo canchas = new Equipo(oid);
		for(Cancha c : DataSingleton.getInstance().getCanchas() ){
			if(c.equals(canchas) )
				return c;
		}
		return null;
	}
	
	
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public void addCancha(Cancha cancha){
		cancha.setOid(UUID.randomUUID().toString());
		
		DataSingleton.getInstance().getCanchas().add(cancha);
	}
	
	
	
	
	@DELETE
	@Path( "/{oid}/canchas/{oidCancha}" )
	@Produces( MediaType.APPLICATION_JSON )
	public void quitarCancha(@PathParam("oid") String oid, String oidCancha){
		Cancha can = new Cancha(oidCancha);
		DataSingleton.getInstance().getCanchas().remove(can);
		
	Cancha canc = new Cancha(oid);
		for(Cancha c : DataSingleton.getInstance().getCanchas() ){
			if(c.equals( oid) )
				c.getCanchas().remove(canc);
		}
	}
	

}
