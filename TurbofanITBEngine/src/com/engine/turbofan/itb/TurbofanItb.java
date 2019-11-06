package com.engine.turbofan.itb;

import com.component.combustioncamber.CombustionCamber;
import com.component.compressor.Compressor;
import com.component.fan.Fan.Fan;
import com.component.inlet.Inlet;
import com.component.nozzle.Nozzle;
import com.component.turbine.Turbine;

public class TurbofanItb {
	
	private Inlet inlet;
	private Fan fan;
	private Compressor lowCompressor;
	private Compressor highCompressor;
	private CombustionCamber mainCombustor;
	private Turbine highTurbine;
	private CombustionCamber itgCombustor;
	private Turbine lowTurbine;
	private Nozzle nozzle;
	
	
	// Coastruttore...
	public TurbofanItb(Inlet inlet, Fan fan, Compressor lowCompressor, Compressor highCompressor,
			CombustionCamber mainCombustor, Turbine highTurbine, CombustionCamber itgCombustor, Turbine lowTurbine,
			Nozzle nozzle) {
		this.inlet = inlet;
		this.fan = fan;
		this.lowCompressor = lowCompressor;
		this.highCompressor = highCompressor;
		this.mainCombustor = mainCombustor;
		this.highTurbine = highTurbine;
		this.itgCombustor = itgCombustor;
		this.lowTurbine = lowTurbine;
		this.nozzle = nozzle;
	}
	
	

}
