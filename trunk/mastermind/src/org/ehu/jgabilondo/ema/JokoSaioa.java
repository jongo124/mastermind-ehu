package org.ehu.jgabilondo.ema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.ehu.jgabilondo.dma.Emaitza;

public class JokoSaioa {

	private static String jokalariIzena;
	private static int zifraKopurua;
	private static final int KOP_MIN = 4;
	private static final int KOP_MAX = 6;
	private JokoSaioa() {
		// TODO Auto-generated constructor stub
	}

	public static void hasieratu(int zifraKop) throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Sartu zure izena:");
			jokalariIzena = br.readLine();
			System.out.println("Zenbat zifrako zenbakiekin jokatu nahi duzu (4-6):");
		}catch(Exception e){e.printStackTrace();}
		
		ZenbakiMakina.hasieratu(zifraKopurua);
			
	}
	
	public static Emaitza jokaldiaEgin(){
		 return null;
	}
}
