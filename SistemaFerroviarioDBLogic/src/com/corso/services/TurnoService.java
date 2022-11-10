package com.corso.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import corso.DAOs.TurnoDAO;
import corso.model.Dipendente;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Turno;
import corso.model.Viaggio;
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
	
	public List<Turno> findByDipendente(Dipendente dipendente) {
		return turnoDAO.findByDipendente(dipendente);
	}
	
	public List<Treno> findTreniByDipendente(Dipendente d) {
		return turnoDAO.findTreniByDipendente(d);
	}
	
	public List<Dipendente> findDipendentiByTreno(Treno treno) {
		return turnoDAO.findDipendentiByTreno(treno);
	}
	
	public List<Dipendente> findDipendentiByData(Date data) {
		return turnoDAO.findDipendentiByData(data);
	}
	
	public void addViaggioTurnoDipendente(List<Integer> dipendenti, Viaggio vi ) {
		
		List<Turno> listaturno= new ArrayList<>();
		DipendenteService ds= new DipendenteService();
		List<Dipendente> listp= ds.getFindMoreDipendente(dipendenti);
		for(Dipendente d: listp) {
			Turno t = new Turno();
			t.setTreno(vi.getIdTreno());
			t.setViaggio(vi);
			Date dataTurno = vi.getDataViaggio();
			t.setDataTurno(dataTurno);
			t.setDipendente(d);
			listaturno.add(t);
	}
		for(Turno turno: listaturno) {
			turnoDAO.add(turno);
		}
    }
	
	public List<Dipendente> getDipendentiByViaggio(Integer idViaggio){
		return turnoDAO.findDipendentiByViaggio(idViaggio);
	}
}
