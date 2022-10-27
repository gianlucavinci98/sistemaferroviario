package com.corso.builder;

import java.util.ArrayList;
import java.util.List;

public class TrenoBuilder {
	
	private List<Vagone> treno = new ArrayList<>();
	
	private TrenoBuilder() {}
	
	public void addVagone(Vagone vagone) {
		treno.add(vagone);
	}
	
	public String show() {
		String s ="Lista Vagoni: ";
		for(Vagone v: treno) {
			s=s+"\n"+v.toString();
		}
		return s;
	}

	
	public static class Builder{
		
		public TrenoBuilder build(String sequenza) {
			TrenoBuilder t = new TrenoBuilder();
			
			for(int i=0;i<sequenza.length();i++) {
				switch(sequenza.charAt(i)) {
				case 'H':
					t.addVagone(new Locomotiva());
				break;
				case 'C':
					t.addVagone(new Cargo());
				break;
				case 'P':
					t.addVagone(new Passeggeri());
				break;
				case 'R':
					t.addVagone(new Ristorante());
				break;
				
				}
			}
			return t;
			
		}
		
	}
}
