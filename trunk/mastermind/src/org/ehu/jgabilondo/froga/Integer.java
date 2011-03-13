package org.ehu.jgabilondo.froga;

import org.ehu.jgabilondo.generic.Ordenagarri;

public class Integer extends Ordenagarri{
	int zenbakia;
	public Integer(int zenbakia) {
		// TODO Auto-generated constructor stub
		this.zenbakia = zenbakia;
	}

	@Override
	public boolean berdin(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.zenbakia == ((Integer)bestea).zenbakia)
			return true;
		else
			return false;
	}

	@Override
	public boolean handiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.zenbakia > ((Integer)bestea).zenbakia)
			return true;
		else
			return false;
	}

	@Override
	public boolean txikiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		if (this.zenbakia < ((Integer)bestea).zenbakia)
			return true;
		else
			return false;
	}

}
