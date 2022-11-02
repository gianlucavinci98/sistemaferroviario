package corso.model.filter;

import java.sql.Date;

import com.corso.services.TrenoService;

import corso.model.Stazione;
import corso.model.Treno;

public class ViaggioFilter {
	
	private Integer idViaggio=0;
	private Stazione partenza=null;
	private Stazione arrivo=null;
	private Treno treno=null;
	private String cittaPartenza=null;
	private String cittaArrivo=null;
	private int idTreno;
	@SuppressWarnings("deprecation")
	private Date dataViaggio=new Date(0,0,0);
	private int voto=0;
	private int nvoti;
	
	
	
	
	public String getCittaPartenza() {
		return cittaPartenza;
	}

	public void setCittaPartenza(String cittaPartenza) {
		this.cittaPartenza = cittaPartenza;
	}

	public String getCittaArrivo() {
		return cittaArrivo;
	}

	public void setCittaArrivo(String cittaArrivo) {
		this.cittaArrivo = cittaArrivo;
	}

	

	
	public void setIdTreno(int idTreno) {
		this.idTreno = idTreno;
		setTreno(idTreno);
	}
	public void setTreno(int idTreno) {
		TrenoService ts=new TrenoService();
		this.treno = ts.findTreno(idTreno);
	}

	public Treno getTreno() {
		return treno;
	}
	public int getIdTreno() {
		return idTreno;
	}

	
	
	private boolean isActive=false;

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

	
	

	public Date getDataViaggio() {
		return dataViaggio;
	}

	public void setDataViaggio(Date dataViaggio) {
		this.dataViaggio = dataViaggio;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public int getNvoti() {
		return nvoti;
	}

	public void setNvoti(int nvoti) {
		this.nvoti = nvoti;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
