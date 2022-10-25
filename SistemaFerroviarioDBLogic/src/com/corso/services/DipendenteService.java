package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.DipendenteDAO;
import corso.model.Dipendente;
import corso.spring.Beans;


public class DipendenteService {
	
	public void getAddDipendente(Dipendente dip) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
	    dao.addDipendente(dip);
	}

	
	public Dipendente getFindDipendente(Integer id) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
		Dipendente d=dao.findDipendente(id);
		return d;
	}

	
	public List<Dipendente> getAllDipendenti() {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
		List<Dipendente> list= dao.allDipendenti();
		return list;
	}

	
	public void getRemoveDipendente(Integer id) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
		dao.removeDipendente(id);
	}

	
	public List<Dipendente> getFindForRuolo(String mansione) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
		List<Dipendente> lista = dao.findForRuolo(mansione);
		return lista;
	}

	
//	public List<Dipendente> getFindForLivello(Integer livello) {
//		@SuppressWarnings("resource")
//		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
//		DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
//		List<Dipendente> list=  dao.findForLivello(livello);
//		return list;
//	}
	

}
