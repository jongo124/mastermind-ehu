package org.ehu.jgabilondo.dma;

import org.ehu.jgabilondo.generic.Ordenagarri;

public class Jokaldi extends Ordenagarri{
	
	private Zenbaki zenbakia;
	private Emaitza emaitza;
	private int ordena;
	
	public Jokaldi() {
		// TODO Auto-generated constructor stub
	}

	public void idatziJokaldia(){
		System.out.println(this.zenbakia + ": " + this.emaitza.getHilKopurua() + " hil; " + this.emaitza.getZaurituKopurua() + " zauritu.");
	}
	public Zenbaki getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(Zenbaki zenbakia) {
		this.zenbakia = zenbakia;
	}

	public Emaitza getEmaitza() {
		return emaitza;
	}

	public void setEmaitza(Emaitza emaitza) {
		this.emaitza = emaitza;
	}

	public int getOrdena() {
		return ordena;
	}

	public void setOrdena(int ordena) {
		this.ordena = ordena;
	}

	@Override
	public boolean berdin(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.ordena == ((Jokaldi)bestea).ordena)
			return true;
		else
			return false;
	}

	@Override
	public boolean handiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.ordena > ((Jokaldi)bestea).ordena)
			return true;
		else
			return false;
	}

	@Override
	public boolean txikiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.ordena < ((Jokaldi)bestea).ordena)
			return true;
		else
			return false;
	}

	
	
}
