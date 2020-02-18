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
	private int speed;

	public Conveyor(String partNumber, String SKU, int speed) {
		super(partNumber, SKU);
		setSpeed(speed);
	}
	/***
	 * Get the speed of the conveyer belt in feet per second
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/***
	 * Define the speed of the conveyer in feet per second
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String toString() {
		return super.toString() + ", Speed: " + speed;
	}

}
