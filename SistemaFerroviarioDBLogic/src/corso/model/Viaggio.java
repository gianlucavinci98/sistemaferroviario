package corso.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "viaggio")
public class Viaggio {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idViaggio;
	
	@ManyToOne
	@JoinColumn (name = "idPartenza")
	private Stazione partenza;
	
	@ManyToOne
	@JoinColumn (name = "idArrivo")
	private Stazione arrivo;
	
	@ManyToOne
	@JoinColumn (name = "idTreno")
	private Treno treno;
	
	@Column
	private Date dataViaggio;

	@OneToMany (mappedBy = "viaggio", fetch = FetchType.EAGER)
	List<Prenotazione> prenotazioni;
	
	@Column
	private int postiPrenotati;

	public Viaggio() {
	}

	public Viaggio(Stazione partenza, Stazione arrivo, Treno treno, Date dataViaggio) {
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.treno = treno;
		this.dataViaggio = dataViaggio;
	}

	public Integer getIdViaggio() {
		return idViaggio;
	}

	public void setIdViaggio(Integer idViaggio) {
		this.idViaggio = idViaggio;
	}

	public Stazione getPartenza() {
		return partenza;
	}

	public void setPartenza(Stazione partenza) {
		this.partenza = partenza;
	}

	public Stazione getArrivo() {
		return arrivo;
	}

	public void setArrivo(Stazione arrivo) {
		this.arrivo = arrivo;
	}

	public Treno getIdTreno() {
		return treno;
	}

	public void setIdTreno(Treno treno) {
		this.treno = treno;
	}

	public Date getDataViaggio() {
		return dataViaggio;
	}

	public void setDataViaggio(Date dataViaggio) {
		this.dataViaggio = dataViaggio;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	public void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}

	@Override
	public String toString() {
		return "Viaggio [idViaggio=" + idViaggio + ", partenza=" + partenza + ", arrivo=" + arrivo + ", treno=" + treno
				+ ", dataViaggio=" + dataViaggio + ", prenotazioni=" + prenotazioni + ", postiPrenotati="
				+ postiPrenotati + "]";
	}

	

	

}
