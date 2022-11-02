package com.corso.builder;

public class CheckStringa {
	
	
	public void checkStringa(String sequenza) throws Exception {
		checkIsEmpty(sequenza);
		checkStartWithH(sequenza);
		checkOtherError(sequenza);
	}

	private void checkOtherError(String sequenza) throws Exception {
		int flagRisto = 0;
		boolean flagCargo = false;
		
		if(sequenza.contains("C")) flagCargo = true;
		for(int i=0;i<sequenza.length();i++) {
			char c = sequenza.charAt(i);
			if(c!='H' && c!='R' && c!='P' && c!='C') throw new Exception();
			if(flagCargo && (c=='R' || c=='P')) throw new Exception();
			if(c=='R') flagRisto++;
			if(flagRisto>2) throw new Exception();
		}
		
	}

	private void checkStartWithH(String sequenza) throws Exception {
		if(!sequenza.startsWith("H")) {
			throw new Exception();
		}
		
	}

	private void checkIsEmpty(String sequenza) throws Exception {
		if(sequenza.isEmpty()) {
			throw new Exception();
		}
		
	}

}
