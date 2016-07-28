package speedsocket.dummy;

import java.util.List;

import speedsocket.core.Equipo;
import speedsocket.dao.DataSingleton;
import speedsocket.dao.EquipoDao;

public class EquipoDummy extends EquipoDao {

	@Override
	public List<Equipo> getEquipo() {
		// TODO Auto-generated method stub
		return DataSingleton.getInstance().getTeams();
	}

	@Override
	public Equipo getEquipo(String nombreEquipo) {
		// TODO Auto-generated method stub
		List<Equipo> equipos =DataSingleton.getInstance().getTeams();
for(Equipo e : equipos){
	if (e.equals(equipos)){
		return e;
	}
}
		return null;
	}

	@Override
	public boolean existeEquipo(String nombreEquipo) {
		// TODO Auto-generated method stub
		List<Equipo> equipos =DataSingleton.getInstance().getTeams();
		for(Equipo e : equipos){
			if (e.equals(equipos)){
				return true;
			}
		}
			
			
		return false;
	}

	@Override
	public void agregarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		DataSingleton.getInstance().getTeams().add(equipo);
	}

	@Override
	public void eliminarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		DataSingleton.getInstance().getTeams().remove(equipo);
	}

	@Override
	public void actualizarEquipo(Equipo equipo, Equipo eActualizado) {
		// TODO Auto-generated method stub
		List<Equipo> equipos =DataSingleton.getInstance().getTeams();
		for(Equipo e : equipos){
			if (e.equals(equipos)){
				e=eActualizado;
			}
		}
	}


}
