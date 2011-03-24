package org.ehu.jgabilondo.ema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.ehu.jgabilondo.dma.Emaitza;
import org.ehu.jgabilondo.dma.Jokaldi;
import org.ehu.jgabilondo.dma.Zenbaki;

public class JokoSaioa {

	private static String jokalariIzena;
	private static int zifraKopurua;
	private static final int KOP_MIN = 4;
	private static final int KOP_MAX = 6;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private JokoSaioa() {
		// TODO Auto-generated constructor stub
	}

	public static void hasieratu() throws IOException{
		try{
			int sarrera;
			boolean ongiIrakurrita = false;
			System.out.println("Sartu zure izena:");
			jokalariIzena = br.readLine();
			System.out.println("Zenbat zifrako zenbakiekin jokatu nahi duzu (4-6):");
			sarrera = Integer.parseInt(br.readLine());
			while (!ongiIrakurrita){
				if(sarrera>=KOP_MIN && sarrera<=KOP_MAX){
					zifraKopurua = sarrera;
					ongiIrakurrita = true;
				}
				else{
					System.out.println("Zifra aukerak 4, 5 edo 6 dira. Idatzi berriz zenbat zifrako zenbakiekin jokatu nahi duzun:");
					sarrera = Integer.parseInt(br.readLine());
				}	
			}
			System.out.println("Listo! Has zintezke jokatzen, zenbaki ezkutua aurkitu arte.");
			System.out.println((zifraKopurua*5)+" jokaldi egin ditzakezu gehienez. ZORTE ON!");
		}catch(Exception e){e.printStackTrace();}
		
		ZenbakiMakina.hasieratu(zifraKopurua);
		JokaldiLista.hasieratu();
			
	}
	
	public static Emaitza jokaldiaEgin(int ordena) throws IOException{
		Zenbaki zenbakia = new Zenbaki(); 
		Emaitza emaitza = null;
		while (emaitza==null){
			System.out.println("Sartu zenbaki bat");
			zenbakia.setZenbakia(br.readLine());
			emaitza = ZenbakiMakina.ezkutuarekinKonparatu(zenbakia);
		}
		Jokaldi jokaldia = new Jokaldi();
		jokaldia.setEmaitza(emaitza);
		jokaldia.setOrdena(ordena);
		jokaldia.setZenbakia(zenbakia);
		JokaldiLista.jokaldiaGehitu(jokaldia);
		jokaldia.idatziJokaldia();
		return emaitza;
	}

	public static String getJokalariIzena() {
		return jokalariIzena;
	}


	public static int getZifraKopurua() {
		return zifraKopurua;
	}

	
	
}
