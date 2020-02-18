/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/13/2020
 * Assignment: 05
 * Description:
 * Citations:
 */
package device;

public class Pump extends Device {
	private float maxFlowRate;

	public Pump (String partNumber, String SKU, float maxFlowRate) {
		super(partNumber, SKU);
		setMaxFlowRate(maxFlowRate);
	}
	
	/***
	 * Get the max flow rate of the pump
	 * @return
	 */
	public float getMaxFlowRate() {
		return maxFlowRate;
	}
	/***
	 * Define the max flow rate of the pump
	 * @param maxFlowRate
	 */
	public void setMaxFlowRate(float maxFlowRate) {
		this.maxFlowRate = maxFlowRate;
	}
	public String toString() {
		return super.toString() + ", Max Flow Rate: " + maxFlowRate;
	}

}
