package com.component.compressor;

import com.air.flow.AirFlow;
import com.component.stage.CompressorStage;

public interface CompressorInterface {

	// Metodi get e set..
	
	CompressorStage[] getListAllStages();
	
	void setListAllStages(CompressorStage[] listAllStages);

	double getAin();

	void setAin(double ain);

	double getAout();

	void setAout(double aout);

	double getLenght();

	void setLenght(double lenght);

	double getWeight();

	void setWeight(double weight);
	
	AirFlow getAirFlowIn();

	void setAirFlowIn(AirFlow airFlowIn);

	AirFlow getAirFlowOut();

	void setAirFlowOut(AirFlow airFlowOut);

	double getOmega();

	void setOmega(double omega);

	double getBeta();

	void setBeta(double beta);

}