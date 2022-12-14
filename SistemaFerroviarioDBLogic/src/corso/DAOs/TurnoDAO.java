package corso.DAOs;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import corso.model.Dipendente;
import corso.model.Treno;
import corso.model.Turno;

@Transactional
public interface TurnoDAO {
	
	public void add(Turno turno);
	public Turno find(Integer idTurno);
	public void delete(Integer idTurno);
	public List<Turno> all();
	public List<Turno> findByDipendente(Dipendente dipendente);
	public List<Treno> findTreniByDipendente(Dipendente dipendente);
	public List<Dipendente> findDipendentiByTreno(Treno treno);
	public List<Dipendente> findDipendentiByData(Date data);
	public List<Dipendente> findDipendentiByViaggio(Integer idViaggio);
}
