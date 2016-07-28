package speedsocket.dummy;

import java.util.List;

import facade.CanchaFacade;
import speedsocket.core.Cancha;
import speedsocket.dao.CanchaDao;
import speedsocket.dao.DataSingleton;

public class CanchaDummy extends CanchaDao {

	private CanchaFacade cf;
	@Override
	public List<Cancha> getCanchas() {
		// TODO Auto-generated method stub
		return cf.getCanchas();
	}

	@Override
	public Cancha getCanchas(String nombreCancha) {
		// TODO Auto-generated method stub
		List<Cancha> canchas = cf.getCanchas();
		for (Cancha c : canchas) {
			if (c.equals(canchas)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean existeCancha(String nombreCancha) {
		// TODO Auto-generated method stub
		List<Cancha> canchas = cf.getCanchas();
		for (Cancha c : canchas) {
			if (c.equals(canchas)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void agregarCancha(Cancha cancha) {
		// TODO Auto-generated method stub
		cf.getCanchas().add(cancha);
	}

	@Override
	public void eliminarCancha(Cancha cancha) {
		// TODO Auto-generated method stub
		cf.getCanchas().remove(cancha);
		
	}

	@Override
	public void actualizarCancha(Cancha cancha, Cancha cActualizado) {
		// TODO Auto-generated method stub
		List<Cancha> canchas = cf.getCanchas();
		for (Cancha c : canchas) {
			if (c.equals(canchas)) {
				c = cActualizado;

			}
		}
	}

	@Override
	public boolean login(Cancha cancha) {
		return false;
		// TODO Auto-generated method stub
		
	}

}
