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
		
			int sarrera;
			boolean ongiIrakurrita = false;
			System.out.println("Sartu zure izena:");
			jokalariIzena = br.readLine();
			
				while (!ongiIrakurrita){
					try{
						System.out.println("Zenbat zifrako zenbakiekin jokatu nahi duzu (4-6):");
						sarrera = Integer.parseInt(br.readLine());
						ongiIrakurrita = zifraKopuruaOngiIrakurrita(sarrera);
			
					}catch(Exception e){
						System.out.println("Zifra aukerak 4, 5 edo 6 dira. Ezin da karaktererik sartu.");
					}
				}
				
			System.out.println("Listo! Has zintezke jokatzen, zenbaki ezkutua aurkitu arte.");
			System.out.println((zifraKopurua*5)+" jokaldi egin ditzakezu gehienez. ZORTE ON!");
		
		ZenbakiMakina.hasieratu(zifraKopurua);
		JokaldiLista.hasieratu();
			
	}
	
	public static Emaitza jokaldiaEgin(int ordena) throws IOException{
		Zenbaki zenbakia = new Zenbaki(); 
		Emaitza emaitza = null;
		boolean sarreraOngi = false;
		while (!sarreraOngi){
			System.out.println("Sartu zenbaki bat:");
			try{
				zenbakia.setZenbakia(br.readLine());
			}catch(Exception e){
				System.out.println("Teklatutik irakurtzerakoan errore bat izan da. Jokaldi hau ez da kontuan hartuko. Sartu zenbaki bat:");
				zenbakia.setZenbakia(br.readLine());
			}
			sarreraOngi = sarreraOna(zenbakia);
		}
		emaitza = ZenbakiMakina.ezkutuarekinKonparatu(zenbakia);
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

	private static boolean sarreraOna(Zenbaki zenbakia){
		//denak zenbakiak direla kontrolatu
		for(int i=0;i<zenbakia.getZenbakia().length();i++){
			if ( !(zenbakia.getZenbakia().codePointAt(i)>=48 && zenbakia.getZenbakia().codePointAt(i)<=57) ){
				System.out.println("Sartutako zenbakia ez da zuzena. Ezin dira karakterak sartu: jokaldi hau ez da kontuan hartuko!");
				return false;
			}
		
			//Begiratu ea behar diren zifrak baino gehiago sartu duten
			if(zenbakia.getZenbakia().length()!=zifraKopurua){
				System.out.println("Zenbakiak "+JokoSaioa.getZifraKopurua()+" zifra izan behar ditu: jokaldi hau ez da kontuan hartuko!");
				return false;
			}
		}
		
		//Zenbakiak errepikatuta dauden begiratu
		for (int k=0;k<zenbakia.getZenbakia().length();k++){
			for(int l=k+1;l<zenbakia.getZenbakia().length();l++){
				if (zenbakia.getZenbakia().charAt(k)==zenbakia.getZenbakia().charAt(l)){
					System.out.println("Ez da zifra errepikatudun zenbakirik onartzen: jokaldi hau ez da kontuan hartuko!");
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean zifraKopuruaOngiIrakurrita(int sarrera){
		if(sarrera>=KOP_MIN && sarrera<=KOP_MAX)
			zifraKopurua = sarrera;
		else{
			System.out.println("Zifra aukerak 4, 5 edo 6 dira.");
			return false;
		}
		return true;
	}
}
