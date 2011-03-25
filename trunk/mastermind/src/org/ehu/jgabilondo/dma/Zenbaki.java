package org.ehu.jgabilondo.dma;

import org.ehu.jgabilondo.ema.JokoSaioa;

public class Zenbaki {
	
	private String zenbakia = "";
	
	public Zenbaki() {
		// TODO Auto-generated constructor stub
	}

	public String getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(String zenbakia) {
		this.zenbakia = zenbakia;
	}

	public Emaitza konparatu(Zenbaki bestea){
		Emaitza emaitza = new Emaitza(0,0);
		//Begiratu ea behar diren zifrak baino gehiago sartu duten
		if(bestea.zenbakia.length()!=this.zenbakia.length()){
			System.out.print("Zenbakiak "+JokoSaioa.getZifraKopurua()+" zifra izan behar ditu: jokaldi hau ez da kontuan hartuko!");
			return null;
		}
		
		//Zenbakiak errepikatuta dauden begiratu
		for (int k=0;k<bestea.zenbakia.length();k++){
			for(int l=k+1;l<bestea.zenbakia.length();l++){
				if (bestea.zenbakia.charAt(k)==bestea.zenbakia.charAt(l)){
					System.out.print("Ez da zifra errepikatudun zenbakirik onartzen: jokaldi hau ez da kontuan hartuko!");
					return null;
				}
			}
		}
			
		//Hildakoak eta zaurituak
		for (int i=0; i<this.zenbakia.length();i++){
			if (bestea.zenbakia.indexOf(zenbakia.charAt(i)) != -1){
				for (int j=0;j<bestea.zenbakia.length();j++){
					if (bestea.zenbakia.charAt(j)==zenbakia.charAt(i)){
						if (j==i){
							emaitza.setHilKopurua(emaitza.getHilKopurua()+1);
						}else{
							emaitza.setZaurituKopurua(emaitza.getZaurituKopurua()+1);
						}
					}
				}
			}
		}
		
		return emaitza;
	}
	
}
