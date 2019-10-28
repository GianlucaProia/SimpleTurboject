package com.air.flow;

public class AirFlow {

	private double T0in;
	private double Tin;
	private double T0out;
	private double Tout;
	private double P0in;
	private double Pin;
	private double P0out;
	private double Pout;
	
	private double cp;
	private double cv;
	private double gamma;
	private double R;
	
	private double MachIn;
	private double MachOut;
	
	private double Cz;
	
	// Costruttore...
	public AirFlow() {
		
	}


	// Metodi get and set...
	public double getT0in() {
		return T0in;
	}


	// Metodi per il calcolo delle quantità sopra elencate...
	public void setT0in(double t0in) {
		T0in = t0in;
	}



	public double getTin() {
		return Tin;
	}



	public void setTin(double tin) {
		Tin = tin;
	}



	public double getT0out() {
		return T0out;
	}



	public void setT0out(double t0out) {
		T0out = t0out;
	}



	public double getTout() {
		return Tout;
	}



	public void setTout(double tout) {
		Tout = tout;
	}



	public double getP0in() {
		return P0in;
	}



	public void setP0in(double p0in) {
		P0in = p0in;
	}



	public double getPin() {
		return Pin;
	}



	public void setPin(double pin) {
		Pin = pin;
	}



	public double getP0out() {
		return P0out;
	}



	public void setP0out(double p0out) {
		P0out = p0out;
	}



	public double getPout() {
		return Pout;
	}



	public void setPout(double pout) {
		Pout = pout;
	}



	public double getCp() {
		return cp;
	}



	public void setCp(double cp) {
		this.cp = cp;
	}



	public double getCv() {
		return cv;
	}



	public void setCv(double cv) {
		this.cv = cv;
	}



	public double getGamma() {
		return gamma;
	}



	public void setGamma(double gamma) {
		this.gamma = gamma;
	}



	public double getMachIn() {
		return MachIn;
	}



	public void setMachIn(double machIn) {
		MachIn = machIn;
	}



	public double getMachOut() {
		return MachOut;
	}



	public void setMachOut(double machOut) {
		MachOut = machOut;
	}



	public double getCz() {
		return Cz;
	}



	public void setCz(double cz) {
		Cz = cz;
	}
	
	
}
