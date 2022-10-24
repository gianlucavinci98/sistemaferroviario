package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import corso.DAOs.DipendenteDAO;

public class DipendenteDAOImpl implements DipendenteDAO{

	@PersistenceContext
	EntityManager manager;
	
}
