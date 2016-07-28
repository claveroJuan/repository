
package speedsocket.rest;

import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import facade.PartidoFacade;
//import facade.PersonaFacade;
import speedsocket.Partido;
import speedsocket.dao.DataSingleton;
//import speedsocket.service.ServiceLocator;

@Path( "partidos" )
public class PartidoRest {

	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Partido> listAll(){
		return DataSingleton.getInstance().getMatches();
	}
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public Partido add( Partido match){
		match.setOid(UUID.randomUUID().toString());
		DataSingleton.getInstance().getMatches().add(match);
		return match;
	}
	
	
//	private PartidoFacade getFacade(){
//		return (PartidoFacade)ServiceLocator.getContext().getBean("persona-facade");
//	}
}
