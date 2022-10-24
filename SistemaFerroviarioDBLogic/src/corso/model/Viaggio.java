package corso.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	public Viaggio() {
	}

	public Viaggio(Integer idViaggio, Stazione partenza, Stazione arrivo, Treno treno, Date dataViaggio) {
		this.idViaggio = idViaggio;
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

	@Override
	public String toString() {
		return "[idViaggio=" + idViaggio + ", partenza=" + partenza.getNomeStazione() + ", arrivo=" + arrivo.getNomeStazione() + ", idTreno=" + treno.getIdTreno()
				+ ", dataViaggio=" + dataViaggio + "]";
	}



}
