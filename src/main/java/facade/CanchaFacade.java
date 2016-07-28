package facade;

import java.util.Date;
import java.util.List;

import speedsocket.core.Cancha;
import speedsocket.dao.CanchaDao;


public class CanchaFacade {

	private CanchaDao dao;
	
	
	public List<Cancha> getCanchas (){
		return dao.getCanchas();
	}
	public Cancha getCancha (String nombreCancha){
		return dao.getCanchas(nombreCancha);
	}
	public void eliminarCancha (String nombreCancha){
		dao.eliminarCancha(new Cancha(nombreCancha));
	}
public void crearCancha( Cancha cancha ){
		
		if( !dao.existeCancha( (cancha.getDireccion()) ) ){
			 cancha.setFechaCreacion(new Date());
			dao.agregarCancha(cancha);
		}else{
			
		}
	}
	
	
	public void actualizarCancha( Cancha cancha, Cancha canchaActualizado){
		dao.actualizarCancha(cancha, canchaActualizado);
	}

	/**
	 * @return the dao
	 */
	public CanchaDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(CanchaDao dao) {
		this.dao = dao;
	}
}
