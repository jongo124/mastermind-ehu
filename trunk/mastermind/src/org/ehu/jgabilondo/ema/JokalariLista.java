package org.ehu.jgabilondo.ema;

import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.generic.ListaGenerikoa;

public class JokalariLista {
	//LINUX EHU
	//private static final String FITXATEGIA = "/docencia/cuentas/j/jgabilondo003/BILDU/PMOO/entregak/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
	//MAC
	private static final String FITXATEGIA = "/Users/JGabiMark/Documents/Programming/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
	
	private static ListaGenerikoa<Jokalari> jokalariLista;
	
	private JokalariLista() {
		// TODO Auto-generated constructor stub
		jokalariLista = new ListaGenerikoa<Jokalari>(true);
	}
	
	private static void gorde(Jokalari j){
		jokalariLista.Kokatu(j);
	}
	
	private static void bistaratu(){
		for(int i=0;i<jokalariLista.ZenbatOsagai();i++)
			((Jokalari)jokalariLista.OsagaiaPosizioan(i)).pantailaratu();
	}
	
	private static void jokalariaGehitu(Jokalari j){
		
	}
	
}
