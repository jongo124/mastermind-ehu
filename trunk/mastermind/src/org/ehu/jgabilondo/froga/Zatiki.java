package org.ehu.jgabilondo.froga;

import java.util.Scanner;

import org.ehu.jgabilondo.generic.Ordenagarri;

public class Zatiki extends Ordenagarri{

	private long zenbakitzailea;
	private long izendatzailea;
	
	public Zatiki() {
		// Eraikitzailea
		this.zenbakitzailea = 0;
		this.izendatzailea = 1;
	}
	
	public Zatiki(long zenbakitzailea, long izendatzailea){
		// Eraikitzailea 2 parametrorekin
		
		this.izendatzailea = izendatzailea;
		this.zenbakitzailea = zenbakitzailea;
	}
	
	public Zatiki(long zenbakitzailea){
		// Eraikitzailea parametro bakarrarekin
		
		this.zenbakitzailea = zenbakitzailea;
		this.izendatzailea = 1;
	}

	public long getZenbakitzailea() {
		// Kontsulta zenbakitzailea
		
		return zenbakitzailea;
	}

	public void setZenbakitzailea(int zenbakitzailea) {
		this.zenbakitzailea = zenbakitzailea;
	}

	public long getIzendatzailea() {
		// Kontsulta izendatzailea
		
		return izendatzailea;
	}

	public void setIzendatzailea(int izendatzailea) {
		this.izendatzailea = izendatzailea;
	}

	public Zatiki batu(Zatiki z){
		
		Zatiki batura = new Zatiki();
		batura.zenbakitzailea = (this.zenbakitzailea * z.izendatzailea) + (z.zenbakitzailea * this.izendatzailea);
		batura.izendatzailea = (this.izendatzailea * z.izendatzailea);
		return batura;
		
	}
	
	public Zatiki ken(Zatiki z){
		
		Zatiki kendura = new Zatiki();
		kendura.zenbakitzailea = (this.zenbakitzailea * z.izendatzailea) - (z.zenbakitzailea * this.izendatzailea);
		kendura.izendatzailea = (this.izendatzailea * z.izendatzailea);
		return kendura;
		
	}
	
	public Zatiki bider(Zatiki z){
		
		Zatiki biderkadura = new Zatiki(this.zenbakitzailea*z.zenbakitzailea, this.izendatzailea*z.izendatzailea);
		return biderkadura;
	}
	
	public Zatiki zati(Zatiki z){
		
		Zatiki zatidura = new Zatiki(this.zenbakitzailea*z.izendatzailea, this.izendatzailea*z.zenbakitzailea);
		
		return zatidura;
	}
	
	public boolean berdin(Zatiki z){
		Zatiki z1 = new Zatiki();
		Zatiki z2 = new Zatiki();
		
		z1.zenbakitzailea = z.zenbakitzailea * this.izendatzailea;
		z1.izendatzailea = z.izendatzailea * this.izendatzailea;
		z2.zenbakitzailea = this.zenbakitzailea * z.izendatzailea;
		z2.izendatzailea = z.izendatzailea * this.izendatzailea;
		
		if (z1.zenbakitzailea == z2.zenbakitzailea)
			return true;
		else
			return false;
	}
	
	public boolean txikiago(Zatiki z){
		Zatiki z1 = new Zatiki();
		Zatiki z2 = new Zatiki();
		
		z1.zenbakitzailea = z.zenbakitzailea * this.izendatzailea;
		z1.izendatzailea = z.izendatzailea * this.izendatzailea;
		z2.zenbakitzailea = this.zenbakitzailea * z.izendatzailea;
		z2.izendatzailea = z.izendatzailea * this.izendatzailea;
		
		if (z1.zenbakitzailea > z2.zenbakitzailea)
			return true;
		else
			return false;
	}
	
	public boolean handiago(Zatiki z){
		Zatiki z1 = new Zatiki();
		Zatiki z2 = new Zatiki();
		
		z1.zenbakitzailea = z.zenbakitzailea * this.izendatzailea;
		z1.izendatzailea = z.izendatzailea * this.izendatzailea;
		z2.zenbakitzailea = this.zenbakitzailea * z.izendatzailea;
		z2.izendatzailea = z.izendatzailea * this.izendatzailea;
		
		if (z1.zenbakitzailea < z2.zenbakitzailea)
			return true;
		else
			return false;
	}
	
	public long zatikiaOso(){
		
		return this.zenbakitzailea / this.izendatzailea;
		
	}
	
	/**
	* eragiketa pribatua, sinplifikatua metodotik egiten zaio dei
	* (Euklidesen algoritmoa erabiltzen du ZKHa kalkulatzeko)
	* @param x zenbaki arrunta
	* @param y zenbaki arrunta
	* @return x eta y-ren zatitzaile komun handiena
	*/
	private long zkh(long x, long y) {
	if (y == 0) {
	return x;
	} else {
	return zkh(y, x % y); //errekurtsiboki
	}
	}
	/**
	* @return zatikia sinplifikaturik
	*/
	public Zatiki sinplifikatua() {
	long m = zkh(Math.abs(this.zenbakitzailea), this.izendatzailea);
	return new Zatiki((this.zenbakitzailea/m), (this.izendatzailea/m));
	}

	public void idatzi(){
		System.out.println(this.zenbakitzailea+"/"+this.izendatzailea);
	}
	
	/**
	* Eragina: zatikiaren zenbakitzailea eta izendatzailea
	* sarreratik irakurritakoez aldatzen ditu.
	* Oharra: zatikiak z/i formatuan etorri behar du, lerro batean
	* Oharra: irakurritako izendatzailea negatiboa bada, zeinua
	* aldatuko zaie bai zenbakitzaileari bai izendatzaileari
	* @param sarrera, nondik zatikia irakurriko baita
	*/
	public void irakurri(Scanner sarrera) {
		long i; //izendatzailea irakurtzeko
		// bereizletzat / (slash-a), zuriuneak eta lerro-bukaerak hartzeko
		sarrera.useDelimiter("[/\\s]");
		this.zenbakitzailea = sarrera.nextInt();
		//slash-aren ondorengo zenbakia irakurri (izendatzailea)
		i = sarrera.nextInt();
		if (i < 0) { //zeinuak aldatu
			this.izendatzailea = -i;
			this.zenbakitzailea = -this.zenbakitzailea;
		}
		else
			this.izendatzailea = i;
	} // irakurri

	@Override
	public boolean berdin(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean txikiago(Ordenagarri bestea) {
		// TODO Auto-generated method stub
		return false;
	}
}