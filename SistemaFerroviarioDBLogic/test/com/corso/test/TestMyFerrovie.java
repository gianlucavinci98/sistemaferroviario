package com.corso.test;

import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import corso.DAOs.TrenoDAO;
import corso.DAOs.ViaggioDAO;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Viaggio;
import corso.spring.Beans;

@SuppressWarnings("unused")
public class TestMyFerrovie {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO daoTreno = factory.getBean("trenoDAO", TrenoDAO.class);
		ViaggioDAO daoViaggio = factory.getBean("viaggioDAO", ViaggioDAO.class);
		
		Treno t = daoTreno.find(3);
		System.out.println(t);
		List<Viaggio> viaggi = daoTreno.getViaggiByTreno(3);
		for (Viaggio v : viaggi)
		{
			System.out.println(v);
		}
		
//		List<Treno> treni = daoTreno.findByTipo("passeggeri");
//		for (Treno tr : treni)
//		{
//			System.out.println(tr);
//		}
		
//		List<Treno> treni = daoTreno.listAll();
//		for (Treno tr : treni)
//		{
//			System.out.println(tr);
//		}
		
//		Stazione arrivo = daoViaggio.findArrivo(1);
//		Stazione partenza = daoViaggio.findPartenza(1);
//		System.out.println(arrivo);
//		System.out.println(partenza);
		

	}

}
