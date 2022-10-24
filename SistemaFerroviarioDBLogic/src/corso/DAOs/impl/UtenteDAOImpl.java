package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import corso.DAOs.UtenteDAO;
import corso.model.Utente;


public class UtenteDAOImpl implements UtenteDAO{
	
	@PersistenceContext
	private EntityManager manager;
	
	public Utente findUserByUsername(String username) {
			Utente u = manager.find(Utente.class,username);
			return u;
	}

}
