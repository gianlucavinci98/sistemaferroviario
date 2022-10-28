package com.corso.builder;

public abstract class Vagone {
	
	public String nome;
	public int peso;
	public double lunghezza;
	
	
	public Vagone(String nome,int peso,double lunghezza) {
		this.nome = nome;
		this.peso=peso;
		this.lunghezza=lunghezza;
	}


	public String getNome() {
		return nome;
	}

	public int getPeso() {
		return peso;
	}

	public double getLunghezza() {
		return lunghezza;
	}


	
	
	
	
	
}
