package com.component.stage;

import com.component.halfstage.HalfStage;

public class CompressorStage {

	private HalfStage rotativeStage;
	private HalfStage fixedStage;
	private double reactionDegree;	
	
	
	public CompressorStage() {
		
	}


	public HalfStage getRotativeStage() {
		return rotativeStage;
	}


	public void setRotativeStage(HalfStage rotativeStage) {
		this.rotativeStage = rotativeStage;
	}


	public HalfStage getFixedStage() {
		return fixedStage;
	}


	public void setFixedStage(HalfStage fixedStage) {
		this.fixedStage = fixedStage;
	}


	public double getReactionDegree() {
		return reactionDegree;
	}


	public void setReactionDegree(double reactionDegree) {
		this.reactionDegree = reactionDegree;
	}
	
	
	
}
