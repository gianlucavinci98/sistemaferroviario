package com.corso.services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import corso.DAOs.UtenteDAO;
import corso.model.Dipendente;
import corso.model.Utente;
import corso.spring.Beans;

public class LoginService {
	BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	UtenteDAO loginDAO = factory.getBean("utenteDAO",UtenteDAO.class);
	
	public Utente getUser(String username) {
		Utente u = loginDAO.findUserByUsername(username);
		return u;
	}
	
	public void addDipendInUtente(Utente u, Dipendente d) {
		loginDAO.addUserDip(u, d);
	}

}
