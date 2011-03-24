package org.ehu.jgabilondo.froga;

import java.util.Scanner;
import java.io.*;

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
		Scanner fitxategia;

		fitxategia = new Scanner(new BufferedReader(new FileReader(JOKALARI_FITXATEGIA)));
		fitxategia.useDelimiter("[/\\s]");
		if (fitxategia.hasNext()) {
			System.out.println(fitxategia.nextInt());
			System.out.println(fitxategia.next());
		}
		
		ZenbakiMakina.hasieratu(4);
		System.out.println(ZenbakiMakina.ezkutua().getZenbakia());
	}

}
