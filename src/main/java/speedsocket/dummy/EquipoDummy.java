package speedsocket.dummy;

import java.util.List;

import speedsocket.core.Equipo;
import speedsocket.dao.EquipoDao;

public class EquipoDummy extends EquipoDao {

	@Override
	public List<Equipo> getEquipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo getEquipo(String nombreEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeEquipo(String nombreEquipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void agregarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarequipo(Equipo equipo, Equipo eActualizado) {
		// TODO Auto-generated method stub
		
	}

}
