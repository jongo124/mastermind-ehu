package org.ehu.jgabilondo.dma;

public class Zenbaki {
	
	private String zenbakia;
	
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
