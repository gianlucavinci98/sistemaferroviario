package corso.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.builder.TrenoBuilder;


import corso.DAOs.TrenoDAO;
import corso.model.Treno;
import corso.spring.Beans;


public class testTrenoBuilder {

	public static void main(String[] args) throws Exception {
			testAddTreno();
		}


	private static void testAddTreno() throws Exception {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao = factory.getBean("trenoDAO",TrenoDAO.class);
		dao.add("HCCC");
	}

}
