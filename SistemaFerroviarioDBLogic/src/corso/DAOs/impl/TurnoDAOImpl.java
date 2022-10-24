package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import corso.DAOs.TurnoDAO;

public class TurnoDAOImpl implements TurnoDAO{
	
	@PersistenceContext
	EntityManager manager;

}
