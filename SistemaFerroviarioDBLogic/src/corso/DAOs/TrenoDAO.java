package corso.DAOs;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import corso.model.Treno;
import corso.model.Viaggio;

@Transactional
public interface TrenoDAO {
	
	public Treno find(int idTreno);	
	public Treno add(String sequenza) throws Exception;	
	public List<Treno> listAll();
	public List<Viaggio> getViaggiByTreno(int idTreno);
}
