package corso.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "treno")
public class Treno {
	
	@Id
	private Integer idTreno;
	
	@Column
	private String tipo;
	
	@Column
	private double velocita;
	
	@Column
	private int numPosti;
	
	@OneToMany (mappedBy = "treno", fetch = FetchType.EAGER)
	private List<Viaggio> viaggi = new ArrayList<>();

	public List<Viaggio> getViaggi() {
		return viaggi;
	}

	public void setViaggi(List<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}

	public Treno() {}

	public Treno(Integer idTreno, String tipo, double velocita, int numPosti) {
		this.idTreno = idTreno;
		this.tipo = tipo;
		this.velocita = velocita;
		this.numPosti = numPosti;
	}

	public Integer getIdTreno() {
		return idTreno;
	}

	public void setIdTreno(Integer idTreno) {
		this.idTreno = idTreno;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	@Override
	public String toString() {
		return "Treno [idTreno=" + idTreno + ", tipo=" + tipo + ", velocita=" + velocita + ", numPosti=" + numPosti
				+ "]";
	}
	
}
