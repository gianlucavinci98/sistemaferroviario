package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import corso.DAOs.StazioneDAO;
import corso.model.Stazione;
import corso.spring.Beans;

public class StazioneService {
	
	private BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	private StazioneDAO daoStazione = factory.getBean("stazioneDAO", StazioneDAO.class);
	
	public List<Stazione> getAll()
	{
		return daoStazione.getAll();
	}
	
	public Stazione findStazione(Integer idStazione)
	{
		return daoStazione.find(idStazione);
	}

}
