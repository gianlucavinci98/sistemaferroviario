package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import corso.DAOs.ViaggioDAO;

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
	
	public void add(Viaggio viaggio)
	{
		viaggioDAO.add(viaggio);
	}
	
	public List<Viaggio> getFindByFilter(ViaggioFilter filter){
		List<Viaggio> list= viaggioDAO .findByFilter(filter);
		return list;
	}
}
