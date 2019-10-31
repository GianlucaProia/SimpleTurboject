package com.air.flow;

public class AirFlow {

	private double T0In;
	private double TIn;
	private double P0In;
	private double PIn;
	private double T0Out;
	private double TOut;
	private double P0Out;
	private double POut;
	
	
	private double cpIn;
	private double cvIn;
	private double gammaIn;
	private double gammaOut;
	private double RIn;
	private double ROut;
	private double cpOut;
	private double cvOut;

	private double MachNumberIn;
	private double MachNumberOut;
	
	private double CzIn;
	private double CzOut;

	
	public AirFlow(){
		// Empty constructor
	}

	public AirFlow(double t0In, double tIn, double p0In, double pIn,
			double t0Out, double tOut, double p0Out, double pOut, double cpIn,
			double cvIn, double gammaIn, double rIn, double cpOut,
			double cvOut, double gammaOut, double rOut, double machNumberIn,
			double machNumberOut, double czIn, double czOut) {
		T0In = t0In;
		TIn = tIn;
		P0In = p0In;
		PIn = pIn;
		T0Out = t0Out;
		TOut = tOut;
		P0Out = p0Out;
		POut = pOut;
		this.cpIn = cpIn;
		this.cvIn = cvIn;
		this.gammaIn = gammaIn;
		RIn = rIn;
		this.cpOut = cpOut;
		this.cvOut = cvOut;
		this.gammaOut = gammaOut;
		ROut = rOut;
		MachNumberIn = machNumberIn;
		MachNumberOut = machNumberOut;
		CzIn = czIn;
		CzOut = czOut;
	}

	public AirFlow(double tIn, double pIn, double gammaIn, double rIn,
			double machNumberIn) {
		TIn = tIn;
		PIn = pIn;
		this.gammaIn = gammaIn;
		RIn = rIn;
		MachNumberIn = machNumberIn;
	}

	
	

	// Metodi get and set...


	
	
}
