package corso.DAOs.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import corso.DAOs.PrenotazioneDAO;
import corso.model.Prenotazione;

public class PrenotazioneDAOImpl implements PrenotazioneDAO{
	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	@Transactional
	public void add(Prenotazione prenotazione) {
		manager.merge(prenotazione);
	}
	
	public List<Prenotazione> findByUsername(String username) {
		String sql = "from Prenotazione where username =: username";
		Query q = manager.createQuery(sql);
		q.setParameter("username", username);
		List<Prenotazione> prenotazioni = q.getResultList();
		return prenotazioni;
		
	}

	@Override
	public List<Prenotazione> all() {
		Query q = manager.createQuery("from Prenotazione",Prenotazione.class);
		List<Prenotazione> l = q.getResultList();
		return l;
	}

}
