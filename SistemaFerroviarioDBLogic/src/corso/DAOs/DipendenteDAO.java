package corso.DAOs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DipendenteDAO {

	@PersistenceContext
	EntityManager manager;
	
}
