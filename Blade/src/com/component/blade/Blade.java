package com.component.blade;

import com.air.flow.VelocityTriangle;
import com.component.aerodynamics.AerodynamicProfile;

public class Blade {
	
	private VelocityTriangle velocityTriangleInMeanRadius;
	private VelocityTriangle velocityTriangleOutMeanRadius;
	private VelocityTriangle[] listAllVelocityTriangle;
	
	
	private AerodynamicProfile profileMeanRadius;
	private AerodynamicProfile[] listAllProfiles;
	
	private double height;
	
	public Blade(){
		
	}	
	

}
