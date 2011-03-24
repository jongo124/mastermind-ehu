package org.ehu.jgabilondo.ema;

import java.lang.Math;

import org.ehu.jgabilondo.dma.Emaitza;
import org.ehu.jgabilondo.dma.Zenbaki;

public class ZenbakiMakina {
	
	private static Zenbaki zenbakiEzkutua;
	private static int zenbaki;
	private ZenbakiMakina() {
		// TODO Auto-generated constructor stub
	}

	public static void hasieratu(int zifraKop){
		zenbakiEzkutua = new Zenbaki();
		zenbakiEzkutua.setZenbakia(zenbakiEzkutua.getZenbakia()+(int)(Math.random()*10));
		for(int i=1;i<zifraKop;i++){
			zenbaki = (int)(Math.random()*10);
			while ( zenbakiEzkutua.getZenbakia().contains(""+zenbaki) )
				zenbaki = (int)(Math.random()*10);
			zenbakiEzkutua.setZenbakia(zenbakiEzkutua.getZenbakia()+zenbaki);
		}
	}
	
	public static Emaitza ezkutuarekinKonparatu(Zenbaki z){
		return zenbakiEzkutua.konparatu(z);
	}
	
	public static Zenbaki ezkutua(){
		return zenbakiEzkutua;
	}
}
