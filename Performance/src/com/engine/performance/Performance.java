package com.engine.performance;

public class Performance {

	private double thrust;
	private double specificThrust;
	private double TSFC;
	
	private double etaTh;
	private double etaProp;
	private double etaTot;
	
	
	public String calculateThrust(double flowRate, double velExit, double V0) {
		
		return "Thrust["+flowRate+","+velExit+","+V0+"]";
	}
	
	
}
