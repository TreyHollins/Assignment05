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

public class Motor extends Device {
	private int maxRPM;
	
	public Motor (String partNumber, String SKU, int maxRPM) {
		super(partNumber, SKU);
		setMaxRPM(maxRPM);
	}

	/***
	 * Get the MaxRPM of the motor
	 * @return
	 */
	public int getMaxRPM() {
		return maxRPM;
	}
	/***
	 * Define the MaxRPM
	 * @param maxRPM
	 */
	public void setMaxRPM(int maxRPM) {
		this.maxRPM = maxRPM;
	}
	
	public void setMaxRPM() {
		this.maxRPM = 0;
	}
	
	public String toString() {
		return super.toString() + ", Max RPM: " + maxRPM;
	}
}
