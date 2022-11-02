package corso.DAOs.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import corso.DAOs.ViaggioDAO;
import corso.model.Stazione;
import corso.model.Viaggio;

public class ViaggioDAOImpl implements ViaggioDAO{
	
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

	@Override
	public List<Viaggio> allViaggi() {
		String jpql = "from Viaggio";  
	    Query q =  manager.createQuery(jpql,Viaggio.class);
		@SuppressWarnings("unchecked")
		List<Viaggio> l = q.getResultList();
		return l;
	}

	@Override
	public void add(Viaggio viaggio) {
		manager.persist(viaggio);
		
	}

	

}
