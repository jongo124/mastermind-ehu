package org.ehu.jgabilondo.ema;

import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.generic.ListaGenerikoa;

public class JokalariLista {
	
	private static ListaGenerikoa<Jokalari> jokalariLista;
	
	private JokalariLista() {
		// TODO Auto-generated constructor stub
		jokalariLista = new ListaGenerikoa<Jokalari>(true);
	}
	
	private static void gorde(){
		
	}
	
	private static void bistaratu(){
		for(int i=0;i<jokalariLista.ZenbatOsagai();i++)
			((Jokalari)jokalariLista.OsagaiaPosizioan(i)).pantailaratu();
	}
	
	private static void jokalariaGehitu(Jokalari j){
		
	}
	
}
