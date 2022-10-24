package corso.DAOs;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import corso.model.Treno;
import corso.model.Viaggio;

@Transactional
public interface TrenoDAO {
	
	public Treno find(int idTreno);	
	public void add(Treno treno);	
	public List<Treno> listAll();
	public List<Treno> findByTipo(String tipo);
	public List<Viaggio> getViaggiByTreno(int idTreno);
}
