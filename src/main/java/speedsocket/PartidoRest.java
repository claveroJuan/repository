
package speedsocket;

import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Partido findById( @PathParam("oid") String oid ){
		Partido match = new Partido(oid);
		for(Partido t : DataSingleton.getInstance().getMatches() ){
			if(t.equals( match) )
				return t;
		}
		return null;
	}
}
