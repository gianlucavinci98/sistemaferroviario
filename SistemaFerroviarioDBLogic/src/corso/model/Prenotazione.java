package corso.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="prenotazione")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPrenotazione;
	
	@ManyToOne
	@JoinColumn(name="username")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name="idViaggio")
	private Viaggio viaggio;

	public Integer getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(Integer idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Viaggio getViaggio() {
		return viaggio;
	}

	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}

	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", utente=" + utente + ", viaggio=" + viaggio + "]";
	}

	

}
