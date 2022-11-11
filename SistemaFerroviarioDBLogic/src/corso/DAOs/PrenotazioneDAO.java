package corso.DAOs;

import java.util.List;

import corso.model.Prenotazione;


public interface PrenotazioneDAO {
	public Prenotazione add(Prenotazione prenotazione);
	public List<Prenotazione> findByUsername(String username);
	public List<Prenotazione> all();
}
