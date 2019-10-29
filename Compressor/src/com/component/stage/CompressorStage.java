package com.component.stage;

import com.component.halfstage.HalfStage;

public class CompressorStage {
	
	private HalfStage rotativeStageMeanRadius;
	private HalfStage fixedStageMeanRadius;
	private double reactionDegree;	
	
	
	public CompressorStage() {
		
	}


	public HalfStage getRotativeStageMeanRadius() {
		return rotativeStageMeanRadius;
	}


	public void setRotativeStageMeanRadius(HalfStage rotativeStageMeanRadius) {
		this.rotativeStageMeanRadius = rotativeStageMeanRadius;
	}


	public HalfStage getFixedStageMeanRadius() {
		return fixedStageMeanRadius;
	}


	public void setFixedStageMeanRadius(HalfStage fixedStageMeanRadius) {
		this.fixedStageMeanRadius = fixedStageMeanRadius;
	}


	public double getReactionDegree() {
		return reactionDegree;
	}


	public void setReactionDegree(double reactionDegree) {
		this.reactionDegree = reactionDegree;
	}

	
}
