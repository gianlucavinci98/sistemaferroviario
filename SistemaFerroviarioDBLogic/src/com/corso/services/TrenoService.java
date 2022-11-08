package com.corso.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.TrenoDAO;
import corso.model.Treno;
import corso.spring.Beans;

public class TrenoService {
	private BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	private TrenoDAO trenoDAO = factory.getBean("trenoDAO", TrenoDAO.class);
	
	public Treno findTreno(int idTreno)
	{
		return trenoDAO.find(idTreno);
	}

	public Treno addTreno(String sequenza) throws Exception {
		return trenoDAO.add(sequenza);
	}

	
	public List<Treno> getAll()
	{
		return trenoDAO.listAll();
	}
	
	public List<Treno> findForType(String type){
		return trenoDAO.findByType(type);
	}
	
}
