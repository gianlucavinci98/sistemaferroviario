package corso.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "treno")
public class Treno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idTreno;
	
	@Column
	private String tipo;
	
	@Column
	private int peso;
	
	@Column 
	private int pesoTrainabile;
	
	@Column
	private int numPosti;
	
	@OneToMany (mappedBy = "treno", fetch = FetchType.EAGER)
	private List<Viaggio> viaggi = new ArrayList<>();
	
	@Column
	private String sigla;

	public List<Viaggio> getViaggi() {
		return viaggi;
	}

	public void setViaggi(List<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}

	public Treno() {}

	public Treno(Integer idTreno, String tipo, int pesoTrainabile, int numPosti) {
		this.idTreno = idTreno;
		this.tipo = tipo;
		this.pesoTrainabile = pesoTrainabile;
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

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}
	

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPesoTrainabile() {
		return pesoTrainabile;
	}

	public void setPesoTrainabile(int pesoTrainabile) {
		this.pesoTrainabile = pesoTrainabile;
	}

	@Override
	public String toString() {
		return "Treno [idTreno=" + idTreno + ", tipo=" + tipo + ",	pesoTrainabile=" + pesoTrainabile + ", numPosti=" + numPosti
				+ ", viaggi=" + viaggi + ", sigla=" + sigla + "]";
	}


	
}
