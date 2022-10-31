package corso.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.builder.TrenoBuilder;
import com.corso.builder.TrenoBuilder.Builder;

import corso.DAOs.TrenoDAO;
import corso.model.Treno;
import corso.spring.Beans;


public class testTrenoBuilder {

	public static void main(String[] args) {
		testBuilderTreno();
		try {
			testAddTreno();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void testAddTreno() throws Exception {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao = factory.getBean("trenoDAO",TrenoDAO.class);
		dao.add("HCCC");
	}

	private static void testBuilderTreno() {
		Builder tb = new Builder();
		//TrenoBuilder t = tb.build("HPPP");
		
	//	System.out.println(t.show());
	}

}
