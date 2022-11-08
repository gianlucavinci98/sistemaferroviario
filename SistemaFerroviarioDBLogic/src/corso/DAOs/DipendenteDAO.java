package corso.DAOs;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import corso.model.Dipendente;


@Transactional
public interface DipendenteDAO {
	public void addDipendente(Integer idDipendente,String nome,String cognome, String ruolo );
	public  List<Dipendente> allDipendenti();
	public Dipendente findDipendente(Integer id);
	public void removeDipendente(Integer id);
	public List<Dipendente> findForRuolo(String mansione);
	public List<Dipendente> findByName(String nome);
	public List<Dipendente> findBySurname(String cognome);

}
