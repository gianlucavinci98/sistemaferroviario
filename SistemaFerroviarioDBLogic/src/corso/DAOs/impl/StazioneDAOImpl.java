package corso.DAOs.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import corso.DAOs.StazioneDAO;


public class StazioneDAOImpl implements StazioneDAO{
	
	@PersistenceContext
	EntityManager manager;

}
