package corso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "stazione")
public class Stazione {

	@Id
	private Integer idStazione;
	
	@Column
	private String nomeStazione;
	
	@Column
	private String citta;

	public Stazione() {
	}

	public Stazione(Integer idStazione, String nomeStazione, String citta) {
		this.idStazione = idStazione;
		this.nomeStazione = nomeStazione;
		this.citta = citta;
	}

	public Integer getIdStazione() {
		return idStazione;
	}

	public void setIdStazione(Integer idStazione) {
		this.idStazione = idStazione;
	}

	public String getNomeStazione() {
		return nomeStazione;
	}

	public void setNomeStazione(String nomeStazione) {
		this.nomeStazione = nomeStazione;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Stazione [idStazione=" + idStazione + ", nomeStazione=" + nomeStazione + ", citta=" + citta + "]";
	}

}
