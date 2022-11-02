package corso.DAOs;

import java.util.List;

import javax.transaction.Transactional;


import corso.model.Stazione;
import corso.model.Viaggio;

@Transactional
public interface ViaggioDAO {
	
	public Stazione findArrivo(int idViaggio);
	public Stazione findPartenza(int idViaggio);
	public void add(Viaggio viaggio);
    public  List<Viaggio> allViaggi();

}
