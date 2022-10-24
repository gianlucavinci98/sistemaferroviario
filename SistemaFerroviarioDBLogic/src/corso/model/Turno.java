package corso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "turno")
public class Turno {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idTurno;
	
	
//	private Dipendente dipendente;
//	
//	private Treno treno;
//	
//	private Date dataTurno;
//
//	public Turno() {
//	}
//
//	public Turno(Dipendente dipendente, Treno treno, Date dataTurno) {
//		this.dipendente = dipendente;
//		this.treno = treno;
//		this.dataTurno = dataTurno;
//	}
//
//	public Integer getIdTurno() {
//		return idTurno;
//	}
//
//	public void setIdTurno(Integer idTurno) {
//		this.idTurno = idTurno;
//	}
//
//	public Dipendente getDipendente() {
//		return dipendente;
//	}
//
//	public void setDipendente(Dipendente dipendente) {
//		this.dipendente = dipendente;
//	}
//
//	public Treno getTreno() {
//		return treno;
//	}
//
//	public void setTreno(Treno treno) {
//		this.treno = treno;
//	}
//
//	public Date getDataTurno() {
//		return dataTurno;
//	}
//
//	public void setDataTurno(Date dataTurno) {
//		this.dataTurno = dataTurno;
//	}

}
