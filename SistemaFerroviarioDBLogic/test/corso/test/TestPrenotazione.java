package corso.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.services.ViaggioService;

import corso.DAOs.PrenotazioneDAO;
import corso.DAOs.UtenteDAO;
import corso.DAOs.ViaggioDAO;
import corso.DAOs.impl.PrenotazioneDAOImpl;
import corso.DAOs.impl.UtenteDAOImpl;
import corso.DAOs.impl.ViaggioDAOImpl;
import corso.model.Prenotazione;
import corso.model.Utente;
import corso.model.Viaggio;
import corso.spring.Beans;

public class TestPrenotazione {

	public static void main(String[] args) {
		//testAddPrenotazione();
		testFindByUsername();

	}

	private static void testFindByUsername() {
		BeanFactory factory3 = new AnnotationConfigApplicationContext(Beans.class);
		PrenotazioneDAO dao3 = factory3.getBean("prenotazioneDAO",PrenotazioneDAO.class);
		
		List<Prenotazione> p = dao3.findByUsername("Andrea");
		
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).toString());
		}
		
		
	}

	private static void testAddPrenotazione() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		ViaggioDAO dao = factory.getBean("viaggioDAO",ViaggioDAO.class);
		
		BeanFactory factory2 = new AnnotationConfigApplicationContext(Beans.class);
		UtenteDAO dao2 = factory.getBean("utenteDAO",UtenteDAO.class);
		
		Viaggio v = dao.find(2);
		Utente u = dao2.findUserByUsername("Andrea");
		
		Prenotazione p = new Prenotazione();
		p.setUtente(u);
		p.setViaggio(v);
		
		BeanFactory factory3 = new AnnotationConfigApplicationContext(Beans.class);
		PrenotazioneDAO dao3 = factory.getBean("prenotazioneDAO",PrenotazioneDAO.class);
		
		dao3.add(p);
		
	}

}
