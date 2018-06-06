package testB.airline;

import java.util.Arrays;

import testB.aircraft.Aircraft;
import testB.aircraft.CompareAircraft;

/**
 * The task: Create a console application that meets the following requirements:
 * • Use OOP features: classes, inheritance, polymorphism, encapsulation. 
 * • Each class must have a meaningful name and informative composition. 
 * • Inheritance should only be applied when it makes sense. 
 * • When encoding, agreement on the code of the java code convention should be used. 
 * • Classes must be correctly arranged in packets. 
 * • The console menu should be minimal. 
 * • You can use files to store the initialization parameters.
 * 
 *  Airline. Determine the hierarchy of aircraft. Create an airline. Calculate
 * the total capacity and carrying capacity. Sorting aircraft of the company in
 * terms of flight range. Find the aircraft in the company, which corresponds to
 * the specified range of fuel consumption parameters.
 * 
 * Execute assignments from Variant B of Ch. 4, implementing their own handlers
 * exceptions and I / O Exceptions.
 */

public class Airline {

	private final String name;
	private int size;
	private Aircraft[] aircrafts;

	public Airline(String name) {
		this.name = name;
		this.size = 0;
		this.aircrafts = new Aircraft[size];
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Aircraft[] getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(Aircraft[] aircrafts) {
		this.aircrafts = aircrafts;
	}

	public void addAircraft(Aircraft a) {
		int index = getAircrafts().length;
		aircrafts = getAircrafts();
		if (getSize() == aircrafts.length)
			growArray();
		aircrafts[index] = a;
		setSize(getSize() + 1);
	}

	private void growArray() {
		Aircraft[] newArray = new Aircraft[aircrafts.length + 1];
		System.arraycopy(aircrafts, 0, newArray, 0, getSize());
		aircrafts = newArray;
	}

	public int getAllSeatsCapacity() {
		int sc = 0;
		for (Aircraft a : getAircrafts()) {
			sc += a.getSeatingCapacity();
		}
		return sc;
	}

	public int getAllCargoCapacity() {
		int sc = 0;
		for (Aircraft a : getAircrafts()) {
			sc += a.getCargoCapacity();
		}
		return sc;
	}

	public void sortAircraftOfRange() {
		Arrays.sort(getAircrafts(), new CompareAircraft());
	}

	public Aircraft[] filterAircraftByFuelCons(int min, int max) {
		Airline res = new Airline("result");
		for (Aircraft a : getAircrafts()) {
			if ((a.getConsOfFuel() >= min) && (a.getConsOfFuel() <= max)) {
				res.addAircraft(a);
			}
		}
		return res.getAircrafts();
	}

	public void showAircraft() {
		for (Aircraft a : getAircrafts()) {
			System.out.println(a.toString());
			System.out.println();
		}
	}

	public static void showAircraft(Aircraft[] arr) {
		for (Aircraft a : arr) {
			System.out.println(a.toString());
			System.out.println();
		}
	}

}
