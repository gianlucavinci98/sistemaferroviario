package corso.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table (name = "turno")
public class Turno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idTurno;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SELECT)
	@JoinColumn(name="idDipendente", nullable=false, updatable=false)
	private Dipendente dipendente;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SELECT)
	@JoinColumn(name="idTreno", nullable=false, updatable=false)
	private Treno treno;
	
	@Column(name="dataTurno")
	private Date dataTurno;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SELECT)
	@JoinColumn(name="idViaggio", nullable=false, updatable=false)
	private Viaggio viaggio;
	
	public Turno() {}

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	public Treno getTreno() {
		return treno;
	}

	public void setTreno(Treno treno) {
		this.treno = treno;
	}

	public Date getDataTurno() {
		return dataTurno;
	}

	public void setDataTurno(Date dataTurno) {
		this.dataTurno = dataTurno;
	}


	public Viaggio getViaggio() {
		return viaggio;
	}

	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}

	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", dipendente=" + dipendente + ", treno=" + treno + ", dataTurno="
				+ dataTurno + "]";
	}
	
}