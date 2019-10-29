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
	
	// Costruttore...
	public AirFlow() {
		
	}


	// Metodi get and set...

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
