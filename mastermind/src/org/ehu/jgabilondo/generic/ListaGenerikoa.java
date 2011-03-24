package org.ehu.jgabilondo.generic;

import java.util.Vector;

public class ListaGenerikoa <Osagai extends Ordenagarri>{

	Vector<Osagai> v;
	Boolean goranzkoOrdena;
	
	
	public ListaGenerikoa(Boolean goranzkoOrdena) {
		this.goranzkoOrdena = goranzkoOrdena;
		v = new Vector<Osagai>();
	}

	public void Kokatu(Osagai o){
		int i = 0;
		if (v.size()==0)
			v.add(o);
		else{
			if (goranzkoOrdena){
				//gorantza ordenatu
				while ( i<v.size() && o.handiago((Osagai)v.elementAt(i)) )
					i++;
				v.insertElementAt(o, i);
			}else{
				//beherantz ordenatu
				while ( i<v.size() && o.txikiago((Osagai)v.elementAt(i))  )
					i++;
				v.insertElementAt(o, i);
			}
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

