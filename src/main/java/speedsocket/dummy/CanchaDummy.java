package speedsocket.dummy;

import java.util.List;

import speedsocket.core.Cancha;
import speedsocket.dao.CanchaDao;

public class CanchaDummy extends CanchaDao{

	@Override
	public List<Cancha> getCanhas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cancha getCanchas(String nombreCancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeCancha(String nombreCancha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void agregarCancha(Cancha cancha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCancha(Cancha cancha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCancha(Cancha cancha, Cancha cActualizado) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
