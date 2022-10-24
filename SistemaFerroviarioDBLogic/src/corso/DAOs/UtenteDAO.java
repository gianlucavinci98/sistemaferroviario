package corso.DAOs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import corso.model.Utente;

@Transactional
public class UtenteDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public Utente findUserByUsername(String username) {
			Utente u = manager.find(Utente.class,username);
			return u;
	}

}
