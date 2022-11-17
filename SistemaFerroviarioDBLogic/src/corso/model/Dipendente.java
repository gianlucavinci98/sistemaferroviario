package corso.model;

import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "dipendente")
public class Dipendente {
	
	@Id
	private Integer idDipendente;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column
	private String ruolo;
	
	@Column 
	private String imgProfilo;

	public Dipendente() {
	}

	public Dipendente(Integer idDipendente, String nome, String cognome, String ruolo) {
		this.idDipendente = idDipendente;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
	}

	public Integer getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(Integer idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	
//	public Image getImgProfilo() {
//		return imgProfilo;
//	}
//
//	public void setImgProfilo(Image imgProfilo) {
//		this.imgProfilo = imgProfilo;
//	}

	@Override
	public String toString() {
		return "Dipendente [idDipendente=" + idDipendente + ", nome=" + nome + ", cognome=" + cognome + ", ruolo="
				+ ruolo + "]";
	}
	

}
