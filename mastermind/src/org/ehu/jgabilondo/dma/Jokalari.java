package org.ehu.jgabilondo.dma;

import java.util.Scanner;

public class Jokalari {
	
	private String izena;
	private long puntuak;
	
	public Jokalari() {
		// TODO Auto-generated constructor stub
	}
	
	public void irakurri(Scanner fitxategia){
		if (fitxategia.hasNext()){
			this.puntuak = fitxategia.nextInt();
			this.izena = fitxategia.next();
		}
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

	
	
}
