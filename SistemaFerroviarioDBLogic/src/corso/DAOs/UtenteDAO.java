package corso.DAOs;

import javax.transaction.Transactional;

import corso.model.Dipendente;
import corso.model.Utente;

@Transactional
public interface UtenteDAO {
	
	public Utente findUserByUsername(String username);

	public void add(String username, String psw);
	public void addUserDip(Utente u, Dipendente d);

}
