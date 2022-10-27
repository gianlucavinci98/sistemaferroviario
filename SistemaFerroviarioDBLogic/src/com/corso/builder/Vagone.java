package com.corso.builder;

public abstract class Vagone {
	
	public String nome;
	public double peso;
	public double lunghezza;
	
	
	public Vagone(String nome,double peso,double lunghezza) {
		this.nome = nome;
		this.peso=peso;
		this.lunghezza=lunghezza;
	}
}
