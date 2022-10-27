package com.corso.builder;

public class Ristorante extends Vagone{

	private static String nome="VagoneRistorante";
	private static double peso=3000;
	private static double lunghezza=11;
	private static int nPiatti=4;
	
	
	public Ristorante() {
		super(nome, peso, lunghezza);
		
	}


	@Override
	public String toString() {
		return "Ristorante [nome=" + nome + ", peso=" + peso + ", lunghezza=" + lunghezza + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
