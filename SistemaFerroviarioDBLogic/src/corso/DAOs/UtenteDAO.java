package corso.DAOs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class UtenteDAO {
	
	@PersistenceContext
	EntityManager manager;

}
