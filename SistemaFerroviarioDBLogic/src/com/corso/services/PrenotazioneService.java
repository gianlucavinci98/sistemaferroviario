package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.PrenotazioneDAO;
import corso.model.Prenotazione;
import corso.model.Utente;
import corso.model.Viaggio;
import corso.spring.Beans;

public class PrenotazioneService {
	private BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	private PrenotazioneDAO prenotazioneDAO = factory.getBean("prenotazioneDAO",PrenotazioneDAO.class);
	
	public List<Prenotazione> findByUsername(String username) {
		
		List<Prenotazione> p = prenotazioneDAO.findByUsername(username);
		
		return p;
	}
	
	public void addPrenotazione(Utente u,Viaggio v) {				
		Prenotazione p = new Prenotazione();
		p.setUtente(u);
		p.setViaggio(v);
		prenotazioneDAO.add(p);
	}
	
	public List<Prenotazione> allPrenotazioni(){
		return prenotazioneDAO.all();
	}
	
}
