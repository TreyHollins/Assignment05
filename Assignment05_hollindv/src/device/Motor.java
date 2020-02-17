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
}
