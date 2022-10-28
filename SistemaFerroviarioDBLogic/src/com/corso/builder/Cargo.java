package com.corso.builder;

public class Cargo extends Vagone {

	private static String nome="Vagone Cargo";
	private static int peso=1000;;
	private static double lunghezza=6;
	private static double pesoTrasportabile=1;
	
	public Cargo() {
		super(nome, peso, lunghezza);
	}

	@Override
	public String toString() {
		return "Cargo [nome=" + nome + ", peso=" + peso + ", lunghezza=" + lunghezza + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
