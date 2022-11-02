package corso.DAOs.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import corso.DAOs.StazioneDAO;
import corso.model.Stazione;


public class StazioneDAOImpl implements StazioneDAO{
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Stazione find(Integer idStazione) {
		
		return manager.find(Stazione.class, idStazione);
	}

	@Override
	public List<Stazione> getAll() {
		String jpql = "from Stazione";  
	    Query q =  manager.createQuery(jpql, Stazione.class);
		@SuppressWarnings("unchecked")
		List<Stazione> ris = q.getResultList();
		return ris;
	}

}
