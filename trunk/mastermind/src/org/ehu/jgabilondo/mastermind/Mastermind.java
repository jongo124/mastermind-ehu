package org.ehu.jgabilondo.mastermind;

import java.io.IOException;
import java.util.Calendar;

import org.ehu.jgabilondo.dma.Emaitza;
import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.ema.JokalariLista;
import org.ehu.jgabilondo.ema.JokaldiLista;
import org.ehu.jgabilondo.ema.JokoSaioa;
import org.ehu.jgabilondo.ema.ZenbakiMakina;

public class Mastermind {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int jokaldiKopurua;
		int i = 1;
		long hasiera, bukaera, denbora, puntuazioa;
		Calendar egutegia;
		Emaitza jokaldikoEmaitza = new Emaitza();
		// TODO Auto-generated method stub
		
		JokoSaioa.hasieratu();
		jokaldiKopurua = JokoSaioa.getZifraKopurua()*5;
		puntuazioa = JokoSaioa.getZifraKopurua()*10000;
		System.out.println(ZenbakiMakina.ezkutua().getZenbakia());
		egutegia = Calendar.getInstance();
		hasiera = egutegia.getTimeInMillis();
		while (i<=jokaldiKopurua && jokaldikoEmaitza.getHilKopurua()!=JokoSaioa.getZifraKopurua()){
			jokaldikoEmaitza = JokoSaioa.jokaldiaEgin(i);
			i++;
		}
		egutegia = Calendar.getInstance();
		bukaera = egutegia.getTimeInMillis();
		denbora = (bukaera-hasiera)/1000;
		if(i==jokaldiKopurua+1){
			System.out.println("\nLastima, jokaldiak agortu dituzu ("+JokoSaioa.getZifraKopurua()+" zifra => "+jokaldiKopurua+" jokaldi gehienez):");
			System.out.println("Hauxe zen zenbaki ezkutua: "+ZenbakiMakina.ezkutua().getZenbakia());
			puntuazioa = 0;
		}
		else if (jokaldikoEmaitza.getHilKopurua()==JokoSaioa.getZifraKopurua()){
			System.out.println("\nZORIONAK ZENBAKI EZKUTUA AURKITU DUZU!!");
			puntuazioa = (puntuazioa - ((i-1)*10)) / denbora;
		}
		System.out.println("Lortutako puntuazioa: "+puntuazioa);
		System.out.println(denbora+" s eman dituzu jokoan guztira.");
		System.out.println("\nHona hemen egin dituzun jokaldiak eta beren emaitzak:\n");
		JokaldiLista.bistaratu();
		Jokalari jokalari = new Jokalari();
		jokalari.setIzena(JokoSaioa.getJokalariIzena());
		jokalari.setPuntuak(puntuazioa);
		JokalariLista.hasieratu();
		JokalariLista.jokalariaGehitu(jokalari);
		System.out.println("\nHauek dira orain arteko 10 jokalaririk onenak:\n");
		JokalariLista.bistaratu();
		JokalariLista.gorde();
		System.out.println("AMAIERA");
	}

}
