package com.corso.builder;

public class Locomotiva extends Vagone {
	private static String nome="Locomotiva";
	private static double peso=4000;
	private static double lunghezza=21;
	private static int potenza=44;
		

	public Locomotiva() {
		super(nome, peso, lunghezza);
	}


	@Override
	public String toString() {
		return "Locomotiva [nome=" + nome + ", peso=" + peso + ", lunghezza=" + lunghezza + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	

	
	
	
	
}
