package org.ehu.jgabilondo.froga;

import java.util.Scanner;
import java.io.*;

import org.ehu.jgabilondo.dma.Jokalari;
import org.ehu.jgabilondo.ema.JokalariLista;
import org.ehu.jgabilondo.ema.ZenbakiMakina;

public class Froga {
	//LINUX EHU
	//private static final String JOKALARI_FITXATEGIA = "/docencia/cuentas/j/jgabilondo003/BILDU/PMOO/entregak/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";
	//MAC
	private static final String JOKALARI_FITXATEGIA = "/Users/JGabiMark/Documents/Programming/mastermind/mastermind/src/org/ehu/jgabilondo/froga/froga.txt";

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*Scanner fitxategia;

		fitxategia = new Scanner(new BufferedReader(new FileReader(JOKALARI_FITXATEGIA)));
		fitxategia.useDelimiter("[/\\s]");
		if (fitxategia.hasNext()) {
			System.out.println(fitxategia.nextInt());
			System.out.println(fitxategia.next());
		}
		
		ZenbakiMakina.hasieratu(4);
		System.out.println(ZenbakiMakina.ezkutua().getZenbakia());*/
		JokalariLista.hasieratu();
		JokalariLista.bistaratu();
		
		Jokalari jokalari = new Jokalari();
		jokalari.setIzena("Jon Kepa");
		jokalari.setPuntuak(12345);
		try {
			JokalariLista.gorde();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------Jokoa bukatu ostean-------------");
		JokalariLista.bistaratu();
	}

}
