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
			
			for(int i=0;i<sequenza.length();i++) {
				switch(sequenza.charAt(i)) {
				case 'H':
					Locomotiva l = new Locomotiva();
					t.addVagone(l);
					peso = peso + l.getPeso();
				break;
				case 'C':
					Cargo c = new Cargo();
					t.addVagone(c);
					peso=peso + c.getPeso();
				break;
				case 'P':
					Passeggeri p = new Passeggeri();
					t.addVagone(p);
					peso=peso + p.getPeso();
					numeroPosti = numeroPosti + p.getnPasseggeri();
				break;
				case 'R':
					Ristorante r = new Ristorante();
					t.addVagone(r);
					peso = peso + r.getPeso();
				break;
				
				}
			}
			
			Treno treno = new Treno();
			treno.setNumPosti(numeroPosti);
			treno.setPeso(peso);
			treno.setSigla(sequenza);
			
			return treno;
			
			
		}
		
		
		
	}
}
