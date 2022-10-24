package corso.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.UtenteDAO;
import corso.model.Utente;
import corso.spring.Beans;



public class TestUtente {

	public static void main(String[] args) {
		testFindUser();

	}

	private static void testFindUser() {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		UtenteDAO dao = factory.getBean("utenteDAO",UtenteDAO.class);
		Utente u = dao.findUserByUsername("Andrea");
		System.out.println(u.getUsername());
	}

}