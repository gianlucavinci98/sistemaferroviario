package corso.DAOs.impl;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import corso.DAOs.TurnoDAO;
import corso.model.Dipendente;
import corso.model.Treno;
import corso.model.Turno;

public class TurnoDAOImpl implements TurnoDAO{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	@Transactional
	public void add(Turno turno) {
		manager.merge(turno);
	}

	@Override
	public Turno find(Integer idTurno) {
		Turno turno = manager.find(Turno.class, idTurno);
		return turno;
	}
	
	@Override
	public List<Turno> all() {
		Query q = manager.createQuery("from Turno", Turno.class);
		@SuppressWarnings("unchecked")
		List<Turno> l = q.getResultList();
		return l;
	}
	
	@Override
	public List<Treno> findTreniByDipendente(Dipendente dipendente) {
		String jpql = "FROM Turno " +
					  "WHERE dipendente = :dipendente";
		
		Query q = manager.createQuery(jpql, Turno.class);
		q.setParameter("dipendente", dipendente);
		@SuppressWarnings("unchecked")
		List<Treno> l = q.getResultList().stream().map((Object o) -> {
															Turno t = (Turno) o;
															return t.getTreno();
														}).distinct().toList();
		return l;
	}

	@Override
	public List<Dipendente> findDipendentiByXTurni(Long x) {
		String jpql = "SELECT dipendente " +
				  	  "FROM Turno " +
				  	  "GROUP BY Dipendente " +
				  	  "HAVING COUNT(*) > :x";
		
		Query q = manager.createQuery(jpql, Dipendente.class);
		q.setParameter("x", x);
		@SuppressWarnings("unchecked")
		List<Dipendente> l = q.getResultList();
		return l;
	}

	@Override
	public List<Dipendente> findDipendentiByTreno(Treno treno) {
		String jpql = "FROM Turno " +
					  "WHERE treno = :treno";
		
		Query q = manager.createQuery(jpql, Turno.class);
		q.setParameter("treno", treno);
		@SuppressWarnings("unchecked")
		List<Dipendente> l = q.getResultList().stream().map((Object o) -> {
																Turno t = (Turno) o;
																return t.getDipendente();
															}).distinct().toList();
		return l;
	}

	@Override
	public List<Dipendente> findDipendentiByData(LocalDate data) {
		String jpql = "SELECT dipendente " +
					  "FROM Turno " +
					  "WHERE dataTurno = :data";
		
		Query q = manager.createQuery(jpql, Dipendente.class);
		q.setParameter("data", data);
		@SuppressWarnings("unchecked")
		List<Dipendente> l = q.getResultList();
		return l;
	}
	
}
