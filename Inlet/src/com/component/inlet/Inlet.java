package com.component.inlet;

import com.air.flow.AirFlow;

public class Inlet {
	
	private double Ain;
	private double Aout;
	private double Rin;
	private double Rout;
	
	private double lenght;
	
	private AirFlow airFlowIn;
	private AirFlow airFlowOut;
	
	// Rendimenti...
	private double etaP;
	
	// Metodi get e set...
	public double getAin() {
		return Ain;
	}
	public void setAin(double ain) {
		Ain = ain;
	}
	public double getAout() {
		return Aout;
	}
	public void setAout(double aout) {
		Aout = aout;
	}
	public double getRin() {
		return Rin;
	}
	public void setRin(double rin) {
		Rin = rin;
	}
	public double getRout() {
		return Rout;
	}
	public void setRout(double rout) {
		Rout = rout;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public AirFlow getAirFlowIn() {
		return airFlowIn;
	}
	public void setAirFlowIn(AirFlow airFlowIn) {
		this.airFlowIn = airFlowIn;
	}
	public AirFlow getAirFlowOut() {
		return airFlowOut;
	}
	public void setAirFlowOut(AirFlow airFlowOut) {
		this.airFlowOut = airFlowOut;
	}
	

}
