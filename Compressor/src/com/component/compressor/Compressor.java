package com.component.compressor;


import java.util.Arrays;

import com.air.flow.AirFlow;
import com.component.stage.CompressorStage;

public class Compressor implements CompressorInterface  {
	
	private CompressorStage[] listAllStages;
	
	private double Ain;
	private double Aout;
	private double lenght;
	private double weight;
	
	private AirFlow airFlowIn;
	private AirFlow airFlowOut;
	
	private double omega;
	private double beta;

	private int numberShaft;
	
	// Rendimenti...
	private double etaAdiabatico;
	private double etaMeccanico;
	
	
	// Costruttore...
	public Compressor(){
		
	} 
	
	
	// Metodi get e set..
	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getListAllStages()
	 */
	public CompressorStage[] getListAllStages() {
		return listAllStages;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setListAllStages(com.component.stage.CompressorStage[])
	 */
	public void setListAllStages(CompressorStage[] listAllStages) {
		this.listAllStages = listAllStages;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAin()
	 */
	public double getAin() {
		return Ain;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAin(double)
	 */
	public void setAin(double ain) {
		Ain = ain;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAout()
	 */

	public double getAout() {
		return Aout;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAout(double)
	 */
	
	public void setAout(double aout) {
		Aout = aout;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getLenght()
	 */
	
	public double getLenght() {
		return lenght;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setLenght(double)
	 */
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getWeight()
	 */
	
	public double getWeight() {
		return weight;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setWeight(double)
	 */
	
	public void setWeight(double weight) {
		this.weight = weight;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAirFlowIn()
	 */
	
	public AirFlow getAirFlowIn() {
		return airFlowIn;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAirFlowIn(com.air.flow.AirFlow)
	 */
	
	public void setAirFlowIn(AirFlow airFlowIn) {
		this.airFlowIn = airFlowIn;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAirFlowOut()
	 */
	
	public AirFlow getAirFlowOut() {
		return airFlowOut;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAirFlowOut(com.air.flow.AirFlow)
	 */
	
	public void setAirFlowOut(AirFlow airFlowOut) {
		this.airFlowOut = airFlowOut;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getOmega()
	 */
	
	public double getOmega() {
		return omega;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setOmega(double)
	 */
	
	public void setOmega(double omega) {
		this.omega = omega;
	}
	
	
	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getBeta()
	 */
	
	public double getBeta() {
		return beta;
	}


	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setBeta(double)
	 */
	
	public void setBeta(double beta) {
		this.beta = beta;
	}


	@Override
	public String toString() {
		return "Compressor [listAllStages=" + Arrays.toString(listAllStages) + ", Ain=" + Ain + ", Aout=" + Aout
				+ ", lenght=" + lenght + ", weight=" + weight + ", airFlowIn=" + airFlowIn + ", airFlowOut="
				+ airFlowOut + ", omega=" + omega + ", beta=" + beta + ", numberShaft=" + numberShaft
				+ ", etaAdiabatico=" + etaAdiabatico + ", etaMeccanico=" + etaMeccanico + "]";
	}
	
	
	
}
