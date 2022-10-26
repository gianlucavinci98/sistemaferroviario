package corso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "utente")
public class Utente {
	
	@Id
	private String username;
	
	@Column
	private String psw;
	
	@Column
	private int livello;
	
	@OneToOne
	@JoinColumn(name="idDipendente", referencedColumnName="idDipendente")
	private Dipendente dipendente;
	
	
	public Utente() {
	}

	public Utente(String username, String psw, int livello) {
		this.username = username;
		this.psw = psw;
		this.livello = livello;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	
	
	
	
}
