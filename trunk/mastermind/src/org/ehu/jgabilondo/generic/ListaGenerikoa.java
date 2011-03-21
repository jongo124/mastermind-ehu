package org.ehu.jgabilondo.generic;

import java.util.Vector;

public class ListaGenerikoa <Osagai extends Ordenagarri>{

	Vector v;
	Boolean goranzkoOrdena;
	
	
	public ListaGenerikoa(Boolean goranzkoOrdena) {
		this.goranzkoOrdena = goranzkoOrdena;
		v = new Vector();
	}

	public void Kokatu(Osagai o){
		int i = 0;
		if (goranzkoOrdena){
			//gorantza ordenatu
			while ( o.handiago((Osagai)v.elementAt(i)) && i<=v.size() )
				i++;
			v.insertElementAt(o, i);
		}else{
			//beherantz ordenatu
			while ( o.txikiago((Osagai)v.elementAt(i)) && i<=v.size() )
				i++;
			v.insertElementAt(o, i);
		}
	}
	
	public Osagai OsagaiaPosizioan(int i){
		Osagai o = (Osagai)v.elementAt(i);
		return o;
	}
	
	public int ZenbatOsagai(){
		int osagaiKop = this.v.size();
		return osagaiKop;
	}
	
}

