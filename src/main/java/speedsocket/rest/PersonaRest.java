package speedsocket.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import facade.PersonaFacade;
import speedsocket.core.Persona;
import speedsocket.service.ServiceLocator;

@Path( "Persona" )
public class PersonaRest {
	@Context
    private HttpServletRequest request;
	
	@GET
	@Path("/session/activa")
	@Produces( MediaType.APPLICATION_JSON )
	public Persona getPersona(){
		Persona persona =
		(Persona)request.getSession().getAttribute("PERSONA");
		return persona;
	}
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Persona> getPersonas(){
		return (List<Persona>) getFacade().getPersona();
	}
	
	@GET
	@Path( "/{nombrePersona}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Persona getPersona(  @PathParam("nombrePersona")  String nombrePersona ){
		return getPersona(nombrePersona);
	}
	
	@DELETE
	@Path( "/{nombrePersona}" )
	@Produces( MediaType.APPLICATION_JSON )
	public void eliminarPersona( @PathParam("nombrePersona") String nombrePersona ){
		getFacade().eliminarPersona(nombrePersona);
	}
	
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public void crearUsuario( Persona persona ){
		getFacade().crearPersona(persona);
	}
	
	
	@POST
	@Path( "/{nombrePersona}" )
	@Produces( MediaType.APPLICATION_JSON )
	public void actualizarPrsona( @PathParam("nombreUsuario") Persona nombrePersona, Persona persona){
		getFacade().actualizarUsuario(persona, persona);
	}
	private PersonaFacade getFacade(){
		return (PersonaFacade)ServiceLocator.getContext().getBean("persona-facade");
	}
	
	

}
