package com.air.flow;

public class AirFlow {

	private double T0;
	private double T;
	private double P0;
	private double P;
	
	private double cp;
	private double cv;
	private double gamma;
	private double R;
	
	private double MachNumber;
	
	private double Cz;

	public AirFlow(){
		
	}


	// Metodi get and set...

	public double getT0() {
		return T0;
	}


	public void setT0(double t0) {
		T0 = t0;
	}


	public double getT() {
		return T;
	}


	public void setT(double t) {
		T = t;
	}


	public double getP0() {
		return P0;
	}


	public void setP0(double p0) {
		P0 = p0;
	}


	public double getP() {
		return P;
	}


	public void setP(double p) {
		P = p;
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


	public double getCz() {
		return Cz;
	}



	public void setCz(double cz) {
		Cz = cz;
	}


	public double getR() {
		return R;
	}


	public void setR(double r) {
		R = r;
	}


	public double getMachNumber() {
		return MachNumber;
	}


	public void setMachNumber(double machNumber) {
		MachNumber = machNumber;
	}
	
	
}
