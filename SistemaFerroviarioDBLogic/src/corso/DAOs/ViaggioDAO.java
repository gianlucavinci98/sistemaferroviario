package corso.DAOs;

import javax.transaction.Transactional;
import corso.model.Stazione;

@Transactional
public interface ViaggioDAO {
	
	public Stazione findArrivo(int idViaggio);
	public Stazione findPartenza(int idViaggio);

}
