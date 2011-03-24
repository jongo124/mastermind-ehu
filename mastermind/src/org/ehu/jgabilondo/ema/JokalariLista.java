package org.ehu.jgabilondo.ema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.generic.ListaGenerikoa;

public class JokalariLista{
	//LINUX EHU
	//private static final String FITXATEGIA = "/docencia/cuentas/j/jgabilondo003/BILDU/PMOO/entregak/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
	//MAC
	private static final String FITXATEGIA = "/Users/JGabiMark/Documents/Programming/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
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
	public static void gorde(Jokalari j) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(FITXATEGIA));

		jokalariLista.Kokatu(j);
		for (int i=0;i<jokalariLista.ZenbatOsagai();i++){
			System.out.println("JOKALARILISTA.GORDE: "+((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getPuntuak()+"/"+((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getIzena());
			pw.println( ((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getPuntuak()+"/"+((Jokalari)jokalariLista.OsagaiaPosizioan(i)).getIzena());
		}
		fitxategia.close();	
		
	}
	
	public static void bistaratu(){
		for(int i=0;i<jokalariLista.ZenbatOsagai();i++)
			((Jokalari)jokalariLista.OsagaiaPosizioan(i)).pantailaratu();
	}
	
	public static void jokalariaGehitu(Jokalari j){
		jokalariLista.Kokatu(j);
	}
	
}
