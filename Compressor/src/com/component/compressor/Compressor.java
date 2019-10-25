package com.component.compressor;

import java.util.List;

import com.air.flow.AirFlow;
import com.component.stage.CompressorStage;

public class Compressor {

	private CompressorStage[] listAllStages;
	
	private double Ain;
	private double Aout;
	private double lenght;
	private double weight;
	
	private AirFlow airFlowIn;
	private AirFlow airFlowOut;
	
	private double omega;
	private double beta;
	
	// Costruttore...
	public Compressor(double P0in, double T0in, double Pout, double Tout ){
		AirFlow airFlowIn = new AirFlow();
		airFlowIn.setP0in(P0in);
		airFlowIn.setT0in(T0in);
		this.airFlowIn = airFlowIn;
		
		AirFlow airFlowOut = new AirFlow();
		airFlowOut.setP0in(P0in);
		airFlowOut.setT0in(T0in);
		this.airFlowOut = airFlowOut;
		
	} 

	
	public Compressor(){
		
	}
	
	
	// Metodi get e set..
	public CompressorStage[] getListAllStages() {
		return listAllStages;
	}



	public void setListAllStages(CompressorStage[] listAllStages) {
		this.listAllStages = listAllStages;
	}



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



	public double getLenght() {
		return lenght;
	}



	public void setLenght(double lenght) {
		this.lenght = lenght;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
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



	public double getOmega() {
		return omega;
	}



	public void setOmega(double omega) {
		this.omega = omega;
	}
	
	
}
