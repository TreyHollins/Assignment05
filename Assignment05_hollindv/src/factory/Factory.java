/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/13/2020
 * Assignment: 05
 * Description:
 * Citations:
 */
package factory;

import device.Conveyor;
import device.Motor;
import device.Pump;

public class Factory {
	private Motor m;
	private Pump p;
	private Conveyor c;
	
	public Factory(Motor motor, Pump pump, Conveyor conveyor) {
		this.m = motor;
		this.p = pump;
		this.c = conveyor;
	}
	
	public String toString() {
		return "Motor: " + this.m.toString() + "\n" +
	           "Pump: " + this.p.toString() + "\n" +
	           "Conveyor: " + this.c.toString();
	}
}
