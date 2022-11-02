package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import corso.DAOs.StazioneDAO;
import corso.model.Stazione;


public class StazioneDAOImpl implements StazioneDAO{
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Stazione find(Integer idStazione) {
		
		return manager.find(Stazione.class, idStazione);
	}

}
