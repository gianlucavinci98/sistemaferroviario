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
	DipendenteDAO DipendenteDAO=  factory.getBean("dipendenteDAO", DipendenteDAO.class);
	
	public void getAddDipendente(Integer idDipendente,String nome,String cognome, String ruolo) {
		
		DipendenteDAO.addDipendente(idDipendente, nome, cognome, ruolo);
	}

	
	public Dipendente getFindDipendente(Integer id) {
		
		Dipendente d=DipendenteDAO.findDipendente(id);
		return d;
	}
	
	public List<Dipendente> getFindMoreDipendente(List<Integer> id) {
		
		List<Dipendente> list= new ArrayList<>();
		for(Integer i : id) {
		Dipendente d=DipendenteDAO.findDipendente(i);
		list.add(d);
		}
		return list;
	}

	
	public List<Dipendente> getAllDipendenti() {
		
		List<Dipendente> list= DipendenteDAO.allDipendenti();
		return list;
	}

	
	public void getRemoveDipendente(Integer id) {
		
		DipendenteDAO.removeDipendente(id);
	}

	
	public List<Dipendente> getFindForRuolo(String mansione) {
		
		List<Dipendente> lista = DipendenteDAO.findForRuolo(mansione);
		return lista;
	}
	
	public List<Dipendente> getFindByName(String nome){
	    List<Dipendente> lis= DipendenteDAO.findByName(nome);
	    return lis;
	}
	
	public List<Dipendente> getFindBySurname(String cognome){
		List<Dipendente> listaa= DipendenteDAO.findBySurname(cognome);
		return listaa;
		}

}
