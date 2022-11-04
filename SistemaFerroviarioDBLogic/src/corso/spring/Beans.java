package corso.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import corso.DAOs.DipendenteDAO;
import corso.DAOs.PrenotazioneDAO;
import corso.DAOs.StazioneDAO;
import corso.DAOs.TrenoDAO;
import corso.DAOs.TurnoDAO;
import corso.DAOs.UtenteDAO;
import corso.DAOs.ViaggioDAO;
import corso.DAOs.impl.DipendenteDAOImpl;
import corso.DAOs.impl.PrenotazioneDAOImpl;
import corso.DAOs.impl.StazioneDAOImpl;
import corso.DAOs.impl.TrenoDAOImpl;
import corso.DAOs.impl.TurnoDAOImpl;
import corso.DAOs.impl.UtenteDAOImpl;
import corso.DAOs.impl.ViaggioDAOImpl;



@Configuration 
public class Beans extends BeansConfig{
	
	/**** sezione DAO ****/
	
	@Bean(name="dipendenteDAO") 
	public DipendenteDAO getDipendenteDAO (){
		DipendenteDAO dao = new DipendenteDAOImpl();
		return dao; 
	}
	
	@Bean(name="stazioneDAO")
	public StazioneDAO getStazioneDAO (){
		StazioneDAO dao = new StazioneDAOImpl();
		return dao; 
	}
	
	@Bean(name="trenoDAO") 
	public TrenoDAO getTrenoDAO (){
		TrenoDAO dao = new TrenoDAOImpl();
		return dao; 
	}
	
	@Bean(name="turnoDAO") 
	public TurnoDAO getTurnoDAO (){
		TurnoDAO dao = new TurnoDAOImpl();
		return dao; 
	}
	
	@Bean(name="utenteDAO") 
	public UtenteDAO getUtenteDAO (){
		UtenteDAO dao = new UtenteDAOImpl();
		return dao; 
	}
	@Bean(name="viaggioDAO") 
	public ViaggioDAO getViaggioDAO (){
		ViaggioDAO dao = new ViaggioDAOImpl();
		return dao; 
	}
	
	@Bean(name="prenotazioneDAO") 
	public PrenotazioneDAO getPrenotazioneDAO (){
		PrenotazioneDAO dao = new PrenotazioneDAOImpl();
		return dao; 
	}

}
