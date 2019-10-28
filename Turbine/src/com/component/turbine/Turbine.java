package com.component.turbine;

import com.air.flow.AirFlow;
import com.component.stage.TurbineStage;

public class Turbine {
	
	
	private TurbineStage[] listAllStageas;
	
	private double Ain;
	private double Aout;
	private double lenght;
	private double weight;
	
	private AirFlow airFlowIn;
	private AirFlow airFlowOut;
	
	private double omega;
	private double beta;
	
	
	public Turbine(){
		
	}


	public TurbineStage[] getListAllStageas() {
		return listAllStageas;
	}


	public void setListAllStageas(TurbineStage[] listAllStageas) {
		this.listAllStageas = listAllStageas;
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


	public double getBeta() {
		return beta;
	}


	public void setBeta(double beta) {
		this.beta = beta;
	}
	

}
