package com.air.flow;

public class VelocityTriangle implements VelocityTriangleInterface {
	
	private double U;
	private double C;
	private double Cz;
	private double Ctheta;
	private double W;
	private double Wz;
	private double Wtheta;
	
	private double alphaIn;
	private double betaIn;
	
	private double alphaOut;
	private double betaOut;
	
	
	public VelocityTriangle(){
	
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getU()
	 */
	public double getU() {
		return U;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setU(double)
	 */
	public void setU(double u) {
		U = u;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getC()
	 */
	public double getC() {
		return C;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setC(double)
	 */
	public void setC(double c) {
		C = c;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getCz()
	 */
	public double getCz() {
		return Cz;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setCz(double)
	 */
	public void setCz(double cz) {
		Cz = cz;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getCtheta()
	 */
	public double getCtheta() {
		return Ctheta;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setCtheta(double)
	 */
	public void setCtheta(double ctheta) {
		Ctheta = ctheta;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getW()
	 */
	public double getW() {
		return W;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setW(double)
	 */
	public void setW(double w) {
		W = w;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getWz()
	 */
	public double getWz() {
		return Wz;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setWz(double)
	 */
	public void setWz(double wz) {
		Wz = wz;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getWtheta()
	 */
	public double getWtheta() {
		return Wtheta;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setWtheta(double)
	 */
	public void setWtheta(double wtheta) {
		Wtheta = wtheta;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getAlphaIn()
	 */
	public double getAlphaIn() {
		return alphaIn;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setAlphaIn(double)
	 */
	public void setAlphaIn(double alphaIn) {
		this.alphaIn = alphaIn;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getBetaIn()
	 */
	public double getBetaIn() {
		return betaIn;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setBetaIn(double)
	 */
	public void setBetaIn(double betaIn) {
		this.betaIn = betaIn;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getAlphaOut()
	 */
	public double getAlphaOut() {
		return alphaOut;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setAlphaOut(double)
	 */
	public void setAlphaOut(double alphaOut) {
		this.alphaOut = alphaOut;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#getBetaOut()
	 */
	public double getBetaOut() {
		return betaOut;
	}


	/* (non-Javadoc)
	 * @see com.air.flow.VelocityTriangleInterface#setBetaOut(double)
	 */
	public void setBetaOut(double betaOut) {
		this.betaOut = betaOut;
	}
	
}
