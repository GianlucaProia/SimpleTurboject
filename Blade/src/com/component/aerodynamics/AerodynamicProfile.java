package com.component.aerodynamics;

import com.air.flow.AirFlow;


public class AerodynamicProfile {

	// Flussi di ingresso e uscita sul profilo...
	private AirFlow airFlowIn;
	private AirFlow airFlowOut;
	
	private double Chord;
	
	private double[] topProfile;
	private double[] bottomProfile;
	
	private double alpha;
	private double stagingAngle;
	
	private double U;
	private double omega;
	
}
