package com.corso.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import corso.DAOs.ViaggioDAO;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;
import corso.spring.Beans;

public class ViaggioService {
	BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	ViaggioDAO viaggioDAO =  factory.getBean("viaggioDAO", ViaggioDAO.class);
	
	public Viaggio findViaggioById(int viaggioID) {

		return viaggioDAO .find(viaggioID);
	}

	
	public List<Viaggio> getAllViaggi() {
		List<Viaggio> list= viaggioDAO .allViaggi();
		return list;
	}
	
	public Viaggio add(Viaggio viaggio)
	{
		return viaggioDAO.add(viaggio);
	}
	
	public List<Viaggio> getFindByFilter(ViaggioFilter filter){
		List<Viaggio> list= viaggioDAO .findByFilter(filter);
		return list;
	}
	
	public Viaggio addViaggioTurno(Integer partenza, Integer arrivo, Integer treno,String dataViaggio) {
		StazioneService s= new StazioneService();
		TrenoService t= new TrenoService();
		Viaggio v= new Viaggio();
		Stazione st1= s.findStazione(partenza);
		Stazione st2 = s.findStazione(arrivo);
		Treno trn= t.findTreno(treno);
		v.setPartenza(st1);
		v.setArrivo(st2);
		v.setIdTreno(trn);
		Date giornoViaggio= Date.valueOf(LocalDate.parse(dataViaggio));
		v.setDataViaggio(giornoViaggio);
		
		return viaggioDAO.add(v);
	}
	
	
}
