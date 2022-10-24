package corso.DAOs;

import javax.transaction.Transactional;
import corso.model.Utente;

@Transactional
public interface UtenteDAO {
	
	public Utente findUserByUsername(String username);

}
