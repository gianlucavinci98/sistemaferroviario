package corso.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import corso.DAOs.TurnoDAO;
import corso.model.Dipendente;
import corso.model.Treno;
import corso.model.Turno;
import corso.spring.Beans;

public class TestTurno {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TurnoDAO turnoDAO = factory.getBean("turnoDAO", TurnoDAO.class);
		
		// Test all()
		List<Turno> turni = turnoDAO.all();
		
		System.out.println("Visualizzo tutti i turni: ");
		for (Turno t : turni) {
			System.out.println(t);
		}
		System.out.println();
		
		// Test find()
		Turno t = turnoDAO.find(1);
		System.out.println("Visualizzo il turno 1: " + t);
		System.out.println();
		
		// Test findDipendenteByData()
		Date data = Date.valueOf(LocalDate.parse("2022-10-30"));
		
		List<Dipendente> dipendenti = turnoDAO.findDipendentiByData(data);
		
		System.out.println("Dipendenti che hanno lavorato in data " + data + ":");
		for (Dipendente d : dipendenti) {
			System.out.println(d);
		}
		System.out.println();
		
		// Test findTreniByDipendente
		List<Treno> treni = turnoDAO.findTreniByDipendente(dipendenti.get(0));
		
		System.out.println("Treni in cui ha lavorato " + dipendenti.get(0).getNome() + ":");
		for (Treno treno : treni) {
			System.out.println(treno);
		}
		System.out.println();
		
		// Test findDipendentiByTreno
		dipendenti = turnoDAO.findDipendentiByTreno(treni.get(0));
		
		System.out.println("Dipendenti che hanno lavorato sul treno " + treni.get(0).getIdTreno() + ":");
		for (Dipendente d : dipendenti) {
			System.out.println(d);
		}
		System.out.println();
	}
	
}
