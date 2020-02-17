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

public class Conveyor extends Device {
	private int Speed;

	/***
	 * Get the speed of the conveyer belt in feet per second
	 * @return
	 */
	public int getSpeed() {
		return Speed;
	}
	/***
	 * Define the speed of the conveyer in feet per second
	 * @param speed
	 */
	public void setSpeed(int speed) {
		Speed = speed;
	}

}
