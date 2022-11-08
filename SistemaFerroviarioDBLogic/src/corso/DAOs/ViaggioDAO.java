package corso.DAOs;

import java.util.List;

import javax.transaction.Transactional;


import corso.model.Stazione;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;

@Transactional
public interface ViaggioDAO {
	
	public Stazione findArrivo(int idViaggio);
	public Stazione findPartenza(int idViaggio);
	public Viaggio add(Viaggio viaggio);
    public  List<Viaggio> allViaggi();
    public  List<Viaggio> findByFilter(ViaggioFilter filter);
    public Viaggio find(int idViaggio);

}
