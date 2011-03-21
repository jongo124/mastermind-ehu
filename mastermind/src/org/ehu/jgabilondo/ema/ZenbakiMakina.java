package org.ehu.jgabilondo.ema;

import java.lang.Math;

import org.ehu.jgabilondo.dma.Emaitza;
import org.ehu.jgabilondo.dma.Zenbaki;

public class ZenbakiMakina {
	
	private static Zenbaki zenbakiEzkutua;
	
	private ZenbakiMakina() {
		// TODO Auto-generated constructor stub
	}

	public static void hasieratu(int zifraKop){
		for(int i=0;i<zifraKop;i++)
			zenbakiEzkutua.setZenbakia(zenbakiEzkutua.getZenbakia()+(int)Math.random());
	}
	
	public static Emaitza ezkutuarekinKonparatu(Zenbaki z){
		return zenbakiEzkutua.konparatu(z);
	}
	
	public static Zenbaki ezkutua(){
		return zenbakiEzkutua;
	}
}
