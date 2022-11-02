package com.corso.builder;

import java.util.ArrayList;
import java.util.List;

import corso.model.Treno;

public class TrenoBuilder {
	
	private List<Vagone> vagoni = new ArrayList<>();	
	
	private TrenoBuilder() {}
	
	public void addVagone(Vagone vagone) {
		vagoni.add(vagone);
	}
	
	
	public String show() {
		String s="Lista vagoni:";
		for(Vagone v : vagoni) {
			s=s+"\n"+v.toString();
		}
		return s;
		
	}

	
	public static class Builder{
		
		public Treno build(String sequenza) {
			TrenoBuilder t = new TrenoBuilder();
			int peso=0;
			int numeroPosti = 0;
			String tipo = null;
			int pesoTrainabile = 0;
			
			for(int i=0;i<sequenza.length();i++) {
				switch(sequenza.charAt(i)) {
				case 'H':
					Locomotiva l = new Locomotiva();
					t.addVagone(l);
					peso = peso + l.getPeso();
					pesoTrainabile = l.getPesoTrainabile();
				break;
				case 'C':
					Cargo c = new Cargo();
					t.addVagone(c);
					peso=peso + c.getPeso();
					tipo = "C";
				break;
				case 'P':
					Passeggeri p = new Passeggeri();
					t.addVagone(p);
					peso=peso + p.getPeso();
					numeroPosti = numeroPosti + p.getnPasseggeri();
					tipo = "P";
				break;
				case 'R':
					Ristorante r = new Ristorante();
					t.addVagone(r);
					peso = peso + r.getPeso();
				break;
				
				}
			}
			
			if(pesoTrainabile>peso) {
				Treno treno = new Treno();
				treno.setNumPosti(numeroPosti);
				treno.setPeso(peso);
				treno.setPesoTrainabile(pesoTrainabile);
				treno.setTipo(tipo);
				treno.setSigla(sequenza);
				return treno;
			}else {
				return null;
			}
			
		}
		
		
		
	}
}
