package corso.model.filter;

import java.sql.Date;

import com.corso.services.TrenoService;


import corso.model.Treno;

public class ViaggioFilter {
	
	private Integer idViaggio;
	private Treno treno;
	private String cittaPartenza;
	private String cittaArrivo;
	private int idTreno;
	@SuppressWarnings("deprecation")
	private Date dataViaggio=new Date(0,0,0);
	
	
	
	
	
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

	public Date getDataViaggio() {
		return dataViaggio;
	}

	public void setDataViaggio(Date dataViaggio) {
		this.dataViaggio = dataViaggio;
	}

	
}
