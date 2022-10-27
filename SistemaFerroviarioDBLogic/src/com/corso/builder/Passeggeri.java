package com.corso.builder;

public class Passeggeri extends Vagone{
	private static String nome="VagonePasseggeri";
	private static double peso=2000;
	private static double lunghezza=8;
	private static int nPasseggeri=50;

	public Passeggeri() {
		super(nome, peso, lunghezza);
	}

	@Override
	public String toString() {
		return "Passeggeri [nome=" + nome + ", peso=" + peso + ", lunghezza=" + lunghezza + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
