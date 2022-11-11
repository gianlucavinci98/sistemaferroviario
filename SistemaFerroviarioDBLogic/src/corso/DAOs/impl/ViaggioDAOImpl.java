package corso.DAOs.impl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.corso.services.StazioneService;

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
		
		if(filter.getIdViaggio()!=null) {
			idViaggio=criteriaBuilder.equal(criteriaRoot.get("idViaggio"), filter.getIdViaggio());
			p=criteriaBuilder.and(p,idViaggio);
		}
		
		if(filter.getCittaPartenza()!="") {
			StazioneService ss = new StazioneService();
			Stazione s = ss.findStazioneByName(filter.getCittaPartenza());
			partenza=criteriaBuilder.equal(criteriaRoot.get("partenza"), s);
			p=criteriaBuilder.and(p,partenza);
		}
		
		if(filter.getCittaArrivo()!="") {
			StazioneService ss = new StazioneService();
			Stazione s = ss.findStazioneByName(filter.getCittaArrivo());
			arrivo=criteriaBuilder.equal(criteriaRoot.get("arrivo"), s);
			p=criteriaBuilder.and(p,arrivo);
		}
		
		if(filter.getDataViaggio()!= Date.valueOf(LocalDate.parse("1899-12-31"))) {
			dataViaggio=criteriaBuilder.greaterThanOrEqualTo(criteriaRoot.get("dataViaggio"), filter.getDataViaggio());
			p=criteriaBuilder.and(p,dataViaggio);
		}
		
		criteriaQuery.where (p);
		 Query q = manager.createQuery (criteriaQuery);
		 List<Viaggio> result = q.getResultList();
		 return result;
		
		
	}

	

}
