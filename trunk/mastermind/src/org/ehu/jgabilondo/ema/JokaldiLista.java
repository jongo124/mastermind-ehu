package org.ehu.jgabilondo.ema;

import org.ehu.jgabilondo.dma.Jokaldi;
import org.ehu.jgabilondo.generic.ListaGenerikoa;

public class JokaldiLista {

	private static ListaGenerikoa<Jokaldi> jokaldiLista;
	private JokaldiLista() {
		// TODO Auto-generated constructor stub
		jokaldiLista = new ListaGenerikoa<Jokaldi>(true);
	}
	
	public static void bistaratu(){
		for(int i=0;i<jokaldiLista.ZenbatOsagai();i++)
			((Jokaldi)jokaldiLista.OsagaiaPosizioan(i)).idatziJokaldia();
	}
	
	public static void jokaldiaGehitu(Jokaldi j){
		jokaldiLista.Kokatu(j);
	}

}
