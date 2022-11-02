package corso.test;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.services.ViaggioService;

import corso.DAOs.StazioneDAO;
import corso.DAOs.TrenoDAO;
import corso.DAOs.ViaggioDAO;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Viaggio;
import corso.spring.Beans;

@SuppressWarnings("unused")
public class TestFerrovie {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO daoTreno = factory.getBean("trenoDAO", TrenoDAO.class);
		ViaggioDAO daoViaggio = factory.getBean("viaggioDAO", ViaggioDAO.class);
		StazioneDAO daoStazione = factory.getBean("stazioneDAO", StazioneDAO.class);
		
		Treno t = daoTreno.find(3);
		Stazione partenza = daoStazione.find(1);
		Stazione arrivo = daoStazione.find(2);
		Date data = Date.valueOf("2022-10-09");
		System.out.println(t + "\n" + partenza + "\n" + arrivo + "\n" + data);
		
		
		ViaggioService vs = new ViaggioService();
		Viaggio v = new Viaggio(partenza, arrivo, t, data);
		//daoViaggio.add(v);
		vs.add(v);
	}

}
