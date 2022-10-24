package corso.DAOs;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import corso.model.Treno;
import corso.model.Viaggio;

@Transactional
public class TrenoDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public Treno find(int idTreno)
	{
		Treno treno = manager.find(Treno.class, idTreno);
		return treno;
	}
	
	public void add(Treno treno)
	{
		manager.persist(treno);
	}
	
	public List<Treno> listAll() {
		String jpql = "from Treno";  
	    Query q =  manager.createQuery(jpql, Treno.class);
		@SuppressWarnings("unchecked")
		List<Treno> ris = q.getResultList();
		return ris;
	}
	
	public List<Treno> findByTipo(String tipo) {
		String jpql = "from Treno where tipo = :tipo";  
		Query q =  manager.createQuery(jpql, Treno.class);
		q.setParameter("tipo", tipo);
		@SuppressWarnings("unchecked")
		List<Treno> ris = q.getResultList();
		return ris;
	}
	
	public List<Viaggio> getViaggiByTreno(int idTreno)
	{
		Treno treno = manager.find(Treno.class, idTreno);
		return treno.getViaggi();
	}

}
