package corso.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import corso.DAOs.DipendenteDAO;
import corso.DAOs.StazioneDAO;
import corso.DAOs.TrenoDAO;
import corso.DAOs.TurnoDAO;
import corso.DAOs.UtenteDAO;
import corso.DAOs.ViaggioDAO;



@Configuration 
public class Beans extends BeansConfig{
	
	/**** sezione DAO ****/
	
	@Bean(name="dipendenteDAO") 
	public DipendenteDAO getDipendenteDAO (){
		DipendenteDAO dao = new DipendenteDAO();
		return dao; 
	}
	
	@Bean(name="stazioneDAO") 
	public StazioneDAO getStazioneDAO (){
		StazioneDAO dao = new StazioneDAO();
		return dao; 
	}
	
	@Bean(name="trenoDAO") 
	public TrenoDAO getTrenoDAO (){
		TrenoDAO dao = new TrenoDAO();
		return dao; 
	}
	
	@Bean(name="turnoDAO") 
	public TurnoDAO getTurnoDAO (){
		TurnoDAO dao = new TurnoDAO();
		return dao; 
	}
	
	@Bean(name="utenteDAO") 
	public UtenteDAO getUtenteDAO (){
		UtenteDAO dao = new UtenteDAO();
		return dao; 
	}
	@Bean(name="viaggioDAO") 
	public ViaggioDAO getViaggioDAO (){
		ViaggioDAO dao = new ViaggioDAO();
		return dao; 
	}

}
