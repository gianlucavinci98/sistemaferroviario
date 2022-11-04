package corso.DAOs;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import corso.model.Dipendente;


@Transactional
public interface DipendenteDAO {
	public void addDipendente(Dipendente dip);
	public  List<Dipendente> allDipendenti();
	public Dipendente findDipendente(Integer id);
	public void removeDipendente(Integer id);
	public List<Dipendente> findForRuolo(String mansione);

}
