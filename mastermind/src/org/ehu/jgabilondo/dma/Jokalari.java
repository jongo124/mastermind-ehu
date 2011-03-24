package org.ehu.jgabilondo.dma;

import java.util.Scanner;

import org.ehu.jgabilondo.generic.Ordenagarri;

public class Jokalari extends Ordenagarri{
	
	private String izena;
	private long puntuak;
	
	public Jokalari() {
		// TODO Auto-generated constructor stub
	}
	
	public void irakurri(Scanner fitxategia){
			this.puntuak = fitxategia.nextInt();
			this.izena = fitxategia.next();
	}
	
	public void pantailaratu(){
		System.out.println(this.izena + ": " + this.puntuak + " puntu");
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public long getPuntuak() {
		return puntuak;
	}

	public void setPuntuak(long puntuak) {
		this.puntuak = puntuak;
	}

	@Override
	public boolean berdin(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.puntuak == ((Jokalari)bestea).puntuak)
			return true;
		else
			return false;
	}

	@Override
	public boolean handiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.puntuak > ((Jokalari)bestea).puntuak)
			return true;
		else
			return false;
	}

	@Override
	public boolean txikiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.puntuak < ((Jokalari)bestea).puntuak)
			return true;
		else
			return false;
	}


	
	
}
