package org.ehu.jgabilondo.ema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.generic.ListaGenerikoa;

public class JokalariLista{
	//LINUX EHU
	//private static final String FITXATEGIA = "/docencia/cuentas/j/jgabilondo003/BILDU/PMOO/entregak/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
	//MAC
	private static final String FITXATEGIA = "froga.txt";
	private static Scanner fitxategia;

	private static ListaGenerikoa<Jokalari> jokalariLista;
	
	private JokalariLista() {
		// TODO Auto-generated constructor stub
	}
	public static void hasieratu() throws FileNotFoundException{
		 fitxategia = new Scanner(new BufferedReader(new FileReader(FITXATEGIA)));
		jokalariLista = new ListaGenerikoa<Jokalari>(false);
		Jokalari jokalari;
		fitxategia.useDelimiter("[/\\s]");
		while (fitxategia.hasNext()){
			jokalari = new Jokalari();
			jokalari.irakurri(fitxategia);
			jokalariLista.Kokatu(jokalari);
		}
		fitxategia.close();
		
	}
	public static void gorde() throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(FITXATEGIA));
		for (int i=0;i<jokalariLista.ZenbatOsagai();i++){
			bw.write(((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getPuntuak()+"/"+((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getIzena()+"\n");
		}
		bw.close();	
		
	}
	
	public static void bistaratu(){
		int i = 0;
		while (i<jokalariLista.ZenbatOsagai() && i<10){
			((Jokalari)jokalariLista.OsagaiaPosizioan(i)).pantailaratu();
			i++;
		}
	}
	
	public static void jokalariaGehitu(Jokalari j){
		jokalariLista.Kokatu(j);
	}
	
}
