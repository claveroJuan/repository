package speedsocket.dummy;

import java.util.List;

import speedsocket.Partido;
import speedsocket.dao.DataSingleton;
import speedsocket.dao.PartidoDao;

public class PartidoDummy extends PartidoDao{

	@Override
	public List<Partido> getPartido() {
		// TODO Auto-generated method stub
		return DataSingleton.getInstance().getMatches();
		
	}

	@Override
	public Partido getPartido(String nombrePartido) {
		// TODO Auto-generated method stub
		List<Partido> partidos = DataSingleton.getInstance().getMatches();
		for( Partido p : partidos ){
			if( partidos.equals(p) ){
				return p;
			}
		}
		return null;
		
	}

	@Override
	public boolean existePartido(String nombrePartido) {
		// TODO Auto-generated method stub
		List<Partido> partidos = DataSingleton.getInstance().getMatches();
		for( Partido p : partidos ){
			if( partidos.equals(p) ){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void agregarPartido(Partido partido) {
		// TODO Auto-generated method stub
		 DataSingleton.getInstance().getMatches().add(partido);
		
	}

	@Override
	public void eliminarPartido(Partido partido) {
		// TODO Auto-generated method stub
		 DataSingleton.getInstance().getMatches().remove(partido);
	}

	@Override
	public void actualizarPartido(Partido partido, Partido pActualizado) {
		// TODO Auto-generated method stub
		List<Partido> partidos =DataSingleton.getInstance().getMatches();
		for(Partido p: partidos){
			if(partidos.equals(p)){
				p=pActualizado;
			}
		}
	}

}
