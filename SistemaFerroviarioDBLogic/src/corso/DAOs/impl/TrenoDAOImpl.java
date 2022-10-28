package corso.DAOs.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.corso.builder.TrenoBuilder.Builder;

import corso.DAOs.TrenoDAO;
import corso.model.Treno;
import corso.model.Viaggio;


public class TrenoDAOImpl implements TrenoDAO{
	
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Treno find(int idTreno)
	{
		Treno treno = manager.find(Treno.class, idTreno);
		return treno;
	}
	
	@Override
	public void add(String sequenza)
	{
		Builder tb = new Builder();
		
		Treno treno = tb.build(sequenza);
		//Treno treno = Builder(stringa);
		manager.persist(treno);
	}
	
	@Override
	public List<Treno> listAll() {
		String jpql = "from Treno";  
	    Query q =  manager.createQuery(jpql, Treno.class);
		@SuppressWarnings("unchecked")
		List<Treno> ris = q.getResultList();
		return ris;
	}
	
	@Override
	public List<Treno> findByTipo(String tipo) {
		String jpql = "from Treno where tipo = :tipo";  
		Query q =  manager.createQuery(jpql, Treno.class);
		q.setParameter("tipo", tipo);
		@SuppressWarnings("unchecked")
		List<Treno> ris = q.getResultList();
		return ris;
	}
	
	@Override
	public List<Viaggio> getViaggiByTreno(int idTreno)
	{
		Treno treno = manager.find(Treno.class, idTreno);
		return treno.getViaggi();
	}

}
