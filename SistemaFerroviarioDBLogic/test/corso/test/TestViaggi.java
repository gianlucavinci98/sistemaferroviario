package corso.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.UtenteDAO;
import corso.DAOs.ViaggioDAO;
import corso.model.Utente;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;
import corso.spring.Beans;

public class TestViaggi {
	public static void main(String[] args) {
		
		
		testFindViaggio();

	}

	private static void testFindViaggio() {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		ViaggioDAO dao = factory.getBean("viaggioDAO",ViaggioDAO.class);
		ViaggioFilter filter=new ViaggioFilter();
		filter.setIdViaggio(122);
		//System.out.println(filter.getIdViaggio());
		List<Viaggio> viaggi = dao.findByFilter(filter);
		for(Viaggio v : viaggi) {
			System.out.println(v.toString());
		}
		
	}

}