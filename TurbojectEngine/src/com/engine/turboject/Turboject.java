package com.engine.turboject;

import com.component.combustioncamber.CombustionCamber;
import com.component.compressor.Compressor;
import com.component.fan.Fan.Fan;
import com.component.inlet.Inlet;
import com.component.nozzle.Nozzle;
import com.component.turbine.Turbine;

public class Turboject {
	
	
	private Inlet inlet;
	private Fan fan;
	private Compressor compressor;
	private CombustionCamber combustionCamber;
	private Turbine turbine;
	private Nozzle nozzle;
	
	
	
	// Costruttore
	public Turboject() {
		
	}
	
	
	// Metodi get e set...
	public Inlet getInlet() {
		return inlet;
	}

	public void setInlet(Inlet inlet) {
		this.inlet = inlet;
	}

	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public Compressor getCompressor() {
		return compressor;
	}

	public void setCompressor(Compressor compressor) {
		this.compressor = compressor;
	}

	public CombustionCamber getCombustionCamber() {
		return combustionCamber;
	}

	public void setCombustionCamber(CombustionCamber combustionCamber) {
		this.combustionCamber = combustionCamber;
	}

	public Turbine getTurbine() {
		return turbine;
	}

	public void setTurbine(Turbine turbine) {
		this.turbine = turbine;
	}

	public Nozzle getNozzle() {
		return nozzle;
	}

	public void setNozzle(Nozzle nozzle) {
		this.nozzle = nozzle;
	}
	
	

}
