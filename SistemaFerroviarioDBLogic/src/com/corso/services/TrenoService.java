package com.corso.services;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.TrenoDAO;
import corso.model.Treno;
import corso.spring.Beans;

public class TrenoService {
	@SuppressWarnings("resource")
	private BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
	private TrenoDAO daoTreno = factory.getBean("trenoDAO", TrenoDAO.class);
	
	public Treno findTreno(int idTreno)
	{
		return daoTreno.find(idTreno);
	}

	public Treno addTreno(String sequenza) throws Exception {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao = factory.getBean("trenoDAO",TrenoDAO.class);
		return dao.add(sequenza);
	}
}
