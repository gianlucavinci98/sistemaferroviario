package com.corso.builder;

import corso.model.Treno;

public class TrenoBuilder {
	private int peso=0;
	private int numeroPosti = 0;
	private String tipo = "P";
	private int pesoTrainabile = 0;
		
		public Treno build(String sequenza) {
			for(int i=0;i<sequenza.length();i++) {
				switch(sequenza.charAt(i)) {
				case 'H':
					Locomotiva l = new Locomotiva();
					peso = peso + l.getPeso();
					pesoTrainabile = l.getPesoTrainabile();
				break;
				case 'C':
					Cargo c = new Cargo();
					peso=peso + c.getPeso();
					tipo = "C";
				break;
				case 'P':
					Passeggeri p = new Passeggeri();
					peso=peso + p.getPeso();
					numeroPosti = numeroPosti + p.getnPasseggeri();
				break;
				case 'R':
					Ristorante r = new Ristorante();
					peso = peso + r.getPeso();
					tipo = tipo + "R";
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
