package corso.DAOs;

import org.springframework.transaction.annotation.Transactional;
import corso.model.Stazione;

@Transactional
public interface StazioneDAO {
	
	public Stazione find(Integer idStazione);

}
