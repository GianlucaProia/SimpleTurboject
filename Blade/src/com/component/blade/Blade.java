package com.component.blade;

import com.air.flow.VelocityTriangle;
import com.component.aerodynamics.AerodynamicProfile;

public class Blade {
	
	// Triangolo di velocità...
	private VelocityTriangle velocityTriangleMeanRadiusIn;
	private VelocityTriangle velocityTriangleMeanRadiusOut;
	private VelocityTriangle[] listAllVelocityTriangle;
	
	// Profili aerodinamici...
	private AerodynamicProfile profileMeanRadius;
	private AerodynamicProfile[] listAllProfiles;
	
	private double height;
	
	public Blade(){
		
	}	
	

}
