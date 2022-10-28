package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import corso.DAOs.ViaggioDAO;

import corso.model.Viaggio;
import corso.spring.Beans;

public class ViaggioService {

	
	public List<Viaggio> getAllViaggi() {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		ViaggioDAO dao=  factory.getBean("viaggioDAO", ViaggioDAO.class);
		List<Viaggio> list= dao.allViaggi();
		return list;
	}
}
