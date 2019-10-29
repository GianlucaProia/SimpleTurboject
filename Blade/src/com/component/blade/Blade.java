package com.component.blade;

import com.air.flow.VelocityTriangleInterface;
import com.component.aerodynamics.AerodynamicProfile;

public class Blade {
	
	private VelocityTriangleInterface velocityTriangleIn;
	private VelocityTriangleInterface velocityTriangleOut;
	
	private AerodynamicProfile profileMeanRadius;
	private AerodynamicProfile[] listAllProfiles;
	
	private double height;
	
	public Blade(){
		
	}	
	

}
