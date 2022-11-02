package corso.DAOs;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import corso.model.Stazione;

@Transactional
public interface StazioneDAO {
	
	public Stazione find(Integer idStazione);
	public List<Stazione> getAll();

}
