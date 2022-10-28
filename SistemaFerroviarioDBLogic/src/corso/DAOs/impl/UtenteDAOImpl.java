package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import corso.DAOs.UtenteDAO;
import corso.model.Dipendente;
import corso.model.Utente;


public class UtenteDAOImpl implements UtenteDAO{
	
	@PersistenceContext
	private EntityManager manager;
	
	public Utente findUserByUsername(String username) {
			Utente u = manager.find(Utente.class,username);
			return u;
	}
	
	@Override
	@Transactional
	public void add(String username, String psw) {
		Utente u=new Utente();
		u.setUsername(username);
		u.setPsw(psw);
		manager.merge(u);
	}
	
	@Override
	@Transactional
	public void addUserDip(Utente u, Dipendente d) {
		 u.setDipendente(d);
		 manager.merge(u);
	}
	

}
