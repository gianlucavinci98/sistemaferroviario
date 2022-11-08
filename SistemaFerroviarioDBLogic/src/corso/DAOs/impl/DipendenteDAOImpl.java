package corso.DAOs.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;



import corso.DAOs.DipendenteDAO;
import corso.model.Dipendente;

public class DipendenteDAOImpl implements DipendenteDAO{

	@PersistenceContext
	EntityManager manager;

	@Override
	@Transactional
	public void addDipendente(Integer idDipendente,String nome,String cognome, String ruolo) {
		Dipendente d = new Dipendente();
		d.setIdDipendente(idDipendente);
		d.setNome(nome);
		d.setCognome(cognome);
		d.setRuolo(ruolo);
		manager.persist(d);
		}

	@Override
	public Dipendente findDipendente(Integer id) {
		Dipendente d= manager.find(Dipendente.class, id);
		return d;
	}
	
	@Override
    public  List<Dipendente> allDipendenti() {
		
		String jpql = "from Dipendente";  
	    Query q =  manager.createQuery(jpql,Dipendente.class);
		@SuppressWarnings("unchecked")
		List<Dipendente> l = q.getResultList();
		return l;
	}
    
	@Override
    @Transactional
    public void removeDipendente(Integer id) {
		Dipendente d= manager.find(Dipendente.class, id);
    	manager.remove(d);;
    }
    
	@Override
    public List<Dipendente> findForRuolo(String mansione){
    		String jpql= "from Dipendente where ruolo =: mansione";
    		Query q = manager.createQuery(jpql, Dipendente.class);
    		q.setParameter("mansione", mansione);
    		@SuppressWarnings("unchecked")
    		List<Dipendente> l = q.getResultList();
    		return l;	
    }

	@Override
	public List<Dipendente> findByName(String nome) {
		String jpql= "from Dipendente where nome =: nome";
		Query q= manager.createQuery(jpql,Dipendente.class);
		q.setParameter("nome", nome);
		@SuppressWarnings("unchecked")
		List<Dipendente> lis = q.getResultList();
		return lis;
	}

	@Override
	public List<Dipendente> findBySurname(String cognome) {
		String jpql= "from Dipendente where cognome =: cognome";
		Query q= manager.createQuery(jpql,Dipendente.class);
		q.setParameter("cognome", cognome);
		@SuppressWarnings("unchecked")
		List<Dipendente> list = q.getResultList();
		return list;
	}

}
