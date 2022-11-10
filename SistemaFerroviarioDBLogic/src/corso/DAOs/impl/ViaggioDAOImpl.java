package corso.DAOs.impl;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import corso.DAOs.ViaggioDAO;
import corso.model.Stazione;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;

public class ViaggioDAOImpl implements ViaggioDAO{
	
	@PersistenceContext
	 EntityManager manager;
	
	@Override
	public Viaggio find(int idViaggio)
	{
		return  manager.find(Viaggio.class, idViaggio);
	}
	
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
	public Viaggio add(Viaggio viaggio) {
		return manager.merge(viaggio);
		
	}

	@Override
	public List<Viaggio> findByFilter(ViaggioFilter filter) {
filter.setActive(true);
		
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		CriteriaQuery<Viaggio> criteriaQuery=  criteriaBuilder.createQuery (Viaggio.class);
		
		Root<Viaggio> criteriaRoot = criteriaQuery.from (Viaggio.class);
		
		
		Predicate idViaggio=null, partenza=null, arrivo=null, treno=null, dataViaggio=null, voto=null, nVoti=null;
		Predicate p=criteriaBuilder.equal(criteriaRoot.get("treno"), criteriaRoot.get("treno"));//Predicato che deve essere sempre vero, da modificare
		
		if(filter.getTreno()!=null) {
			treno=criteriaBuilder.equal(criteriaRoot.get("treno"), filter.getTreno());
			p=criteriaBuilder.and(p,treno);
		}
		
		if(filter.getIdViaggio()>0) {
			idViaggio=criteriaBuilder.equal(criteriaRoot.get("idViaggio"), filter.getIdViaggio());
			p=criteriaBuilder.and(p,idViaggio);
		}
		
		if(filter.getPartenza()!=null) {
			partenza=criteriaBuilder.equal(criteriaRoot.get("partenza"), filter.getPartenza());
			p=criteriaBuilder.and(p,partenza);
		}
		
		if(filter.getArrivo()!=null) {
			arrivo=criteriaBuilder.equal(criteriaRoot.get("arrivo"), filter.getArrivo());
			p=criteriaBuilder.and(p,arrivo);
		}
		
		if(filter.getDataViaggio()!=new Date(0, 0, 0)) {
			dataViaggio=criteriaBuilder.greaterThan(criteriaRoot.get("dataViaggio"), filter.getDataViaggio());
			p=criteriaBuilder.and(p,dataViaggio);
		}
		
		if(filter.getVoto()>0) {
			voto=criteriaBuilder.greaterThanOrEqualTo(criteriaRoot.get("voto"), filter.getVoto());
			p=criteriaBuilder.and(p,voto);
		}
		
		if(filter.getNvoti()>0) {
			nVoti=criteriaBuilder.greaterThanOrEqualTo(criteriaRoot.get("nvoti"), filter.getNvoti());
			p=criteriaBuilder.and(p,nVoti);
		}
		
		
		
//		if(filter.getNvoti()>0) {
//			treno=criteriaBuilder.greaterThan(criteriaRoot.get("nVoti"), filter.getNvoti());
//			p=criteriaBuilder.and(p,treno);
//		}
//		
		
		criteriaQuery.where (p);
		 Query q = manager.createQuery (criteriaQuery);
		// q.setMaxResults (1);
		 List<Viaggio> result = q.getResultList();
		 return result;
		
		
	}

	

}
