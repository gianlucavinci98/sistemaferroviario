package com.corso.services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import corso.DAOs.UtenteDAO;
import corso.model.Utente;
import corso.spring.Beans;

public class LoginService {
	
	public Utente getUser(String username) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		UtenteDAO dao = factory.getBean("utenteDAO",UtenteDAO.class);
		Utente u = dao.findUserByUsername(username);
		return u;
	}

}
