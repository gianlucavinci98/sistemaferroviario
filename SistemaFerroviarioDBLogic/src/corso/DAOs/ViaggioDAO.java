package corso.DAOs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import corso.model.Stazione;

@Transactional
public class ViaggioDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public Stazione findArrivo(int idViaggio)
	{
		String jpql = "select arrivo from Viaggio where idViaggio = :viaggio";  
	    Query q =  manager.createQuery(jpql, Stazione.class);
	    q.setParameter("viaggio", idViaggio);
	    return (Stazione) q.getSingleResult();
	}
	
	public Stazione findPartenza(int idViaggio)
	{
		String jpql = "select partenza from Viaggio where idViaggio = :viaggio";  
	    Query q =  manager.createQuery(jpql, Stazione.class);
	    q.setParameter("viaggio", idViaggio);
	    return (Stazione) q.getSingleResult();
	}

}
