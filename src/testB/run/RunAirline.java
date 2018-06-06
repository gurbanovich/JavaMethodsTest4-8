package testB.run;

import testB.aircraft.Aircraft;
import testB.aircraft.CargoAircraft;
import testB.aircraft.CommercialPassAircraft;
import testB.aircraft.LightPassAircraft;
import testB.airline.Airline;
import testB.airlineException.AircraftException;

/**
 * Demo class Airline
 */

public class RunAirline {

	public static void main(String[] args) throws AircraftException {

		Aircraft a1 = new CommercialPassAircraft("A320", "AirBus", 4000, 2100, 180, 1200);
		Aircraft a2 = new CommercialPassAircraft("737", "Boing", 5000, 2300, 190, 4500);
		Aircraft a3 = new LightPassAircraft("172", "Cessna", 300, 200, 3);
		Aircraft a4 = new CargoAircraft("MD-11F", "McDonnell Douglas", 10000, 3400, 42000);

		Airline company = new Airline("U-Airline");
		company.addAircraft(a1);
		company.addAircraft(a4);
		company.addAircraft(a2);
		company.addAircraft(a3);
		company.addAircraft(a3);
		company.addAircraft(a1);
		company.addAircraft(a4);
		company.addAircraft(a2);

		company.showAircraft();
		System.out.println();

		// Showing total passanger capacity
		System.out.println("Passanger capacity: " + company.getAllSeatsCapacity() + " seats");
		System.out.println();

		// Showing total cargo capacity
		System.out.println("Cargo capacity: " + company.getAllCargoCapacity() + " kg");
		System.out.println();

		// Showing sorting aircraft of the company in terms of flight range
		System.out.println("Aircrafts after sorting by range of flight: ");
		company.sortAircraftOfRange();
		company.showAircraft();
		System.out.println();

		// Showing the aircraft in the company, which corresponds to the
		// specified range of fuel consumption parameters
		System.out.println("Aircrafts after filter by fuel consumption: ");
		Airline.showAircraft(company.filterAircraftByFuelCons(2000, 3000));

	}

}
