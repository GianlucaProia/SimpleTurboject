package com.component.compressor;


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

	// Costruttore...
	public Compressor(){
		
	}
	
	
	// Metodi get e set..
	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getListAllStages()
	 */
	@Override
	public CompressorStage[] getListAllStages() {
		return listAllStages;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setListAllStages(com.component.stage.CompressorStage[])
	 */
	@Override
	public void setListAllStages(CompressorStage[] listAllStages) {
		this.listAllStages = listAllStages;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAin()
	 */
	@Override
	public double getAin() {
		return Ain;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAin(double)
	 */
	@Override
	public void setAin(double ain) {
		Ain = ain;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAout()
	 */
	@Override
	public double getAout() {
		return Aout;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAout(double)
	 */
	@Override
	public void setAout(double aout) {
		Aout = aout;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getLenght()
	 */
	@Override
	public double getLenght() {
		return lenght;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setLenght(double)
	 */
	@Override
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getWeight()
	 */
	@Override
	public double getWeight() {
		return weight;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setWeight(double)
	 */
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAirFlowIn()
	 */
	@Override
	public AirFlow getAirFlowIn() {
		return airFlowIn;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAirFlowIn(com.air.flow.AirFlow)
	 */
	@Override
	public void setAirFlowIn(AirFlow airFlowIn) {
		this.airFlowIn = airFlowIn;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getAirFlowOut()
	 */
	@Override
	public AirFlow getAirFlowOut() {
		return airFlowOut;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setAirFlowOut(com.air.flow.AirFlow)
	 */
	@Override
	public void setAirFlowOut(AirFlow airFlowOut) {
		this.airFlowOut = airFlowOut;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getOmega()
	 */
	@Override
	public double getOmega() {
		return omega;
	}



	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setOmega(double)
	 */
	@Override
	public void setOmega(double omega) {
		this.omega = omega;
	}
	
	
	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#getBeta()
	 */
	@Override
	public double getBeta() {
		return beta;
	}


	/* (non-Javadoc)
	 * @see com.component.compressor.CompressorInterface#setBeta(double)
	 */
	@Override
	public void setBeta(double beta) {
		this.beta = beta;
	}
	
}
