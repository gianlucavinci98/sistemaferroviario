package com.corso.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.TurnoDAO;
import corso.model.Dipendente;
import corso.model.Treno;
import corso.model.Turno;
import corso.spring.Beans;

public class TurnoService {
	
	private BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	private TurnoDAO turnoDAO = factory.getBean("turnoDAO", TurnoDAO.class);
	
	public void addTurno(Turno t) {
		turnoDAO.add(t);
	}
	
	public Turno getTurno(Integer id) {
		return turnoDAO.find(id);
	}
	
	public void deleteTurno(Integer id) {
		turnoDAO.delete(id);
	}
	
	public List<Turno> allTurni() {
		return turnoDAO.all();
	}
	
	public List<Treno> findTreniByDipendente(Dipendente d) {
		return turnoDAO.findTreniByDipendente(d);
	}
	
	public List<Dipendente> findDipendentiByXTurni(Long x) {
		return turnoDAO.findDipendentiByXTurni(x);
	}
	
	public List<Dipendente> findDipendentiByTreno(Treno treno) {
		return turnoDAO.findDipendentiByTreno(treno);
	}
	
	public List<Dipendente> findDipendentiByData(LocalDate data) {
		return turnoDAO.findDipendentiByData(data);
	}
	
}
