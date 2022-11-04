package com.corso.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.DipendenteDAO;
import corso.model.Dipendente;
import corso.spring.Beans;


public class DipendenteService {
	
	BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	DipendenteDAO dao=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
	
	public void getAddDipendente(Dipendente dip) {
		
	    dao.addDipendente(dip);
	}

	
	public Dipendente getFindDipendente(Integer id) {
		
		Dipendente d=dao.findDipendente(id);
		return d;
	}
	
	public List<Dipendente> getFindMoreDipendente(List<Integer> id) {
		
		List<Dipendente> list= new ArrayList<>();
		for(Integer i : id) {
		Dipendente d=dao.findDipendente(i);
		list.add(d);
		}
		return list;
	}

	
	public List<Dipendente> getAllDipendenti() {
		
		List<Dipendente> list= dao.allDipendenti();
		return list;
	}

	
	public void getRemoveDipendente(Integer id) {
		
		dao.removeDipendente(id);
	}

	
	public List<Dipendente> getFindForRuolo(String mansione) {
		
		List<Dipendente> lista = dao.findForRuolo(mansione);
		return lista;
	}

	
	

}
