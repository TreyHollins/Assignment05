/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/13/2020
 * Assignment: 05
 * Description:
 * Citations:
 */
package main;

import device.Conveyor;
import device.Motor;
import device.Pump;
import factory.Factory;

public class Main {

	public static void main(String[] args) {
		Motor mo = new Motor("12345GHJK","ABC1234", 1000);
		Pump pu = new Pump("4576LKJ","GBOE708", (float) 10.25);
		Conveyor co = new Conveyor("ASFD431", "GOEJ532", 100);
		Factory f = new Factory(mo, pu, co);
		System.out.println(f.toString());
	}

}
