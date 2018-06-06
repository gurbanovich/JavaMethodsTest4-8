package testB.aircraft;

import testB.airlineException.AircraftException;

public abstract class Aircraft {

	private final String model;
	private final String manufact;
	private final Integer rangeOfFlight;
	private final Integer consOfFuel;

	public Aircraft(String model, String manufact, int rangeOfFlight, int consOfFuel) throws AircraftException {
		if (model == null || manufact == null || rangeOfFlight == 0 || consOfFuel == 0)
			throw new AircraftException("It is not all parameters of aircraft");
		this.model = model;
		this.manufact = manufact;
		this.rangeOfFlight = rangeOfFlight;
		this.consOfFuel = consOfFuel;
	}

	public abstract int getSeatingCapacity();

	public abstract int getCargoCapacity();

	public String getModel() {
		return model;
	}

	public String getManufact() {
		return manufact;
	}

	public Integer getRangeOfFlight() {
		return rangeOfFlight;
	}

	public Integer getConsOfFuel() {
		return consOfFuel;
	}

	@Override
	public String toString() {
		return "Aircraft manufactured by: " + manufact + "\nmodel " + model + "\nrange of flight " + rangeOfFlight
				+ " km" + "\nconsuption of fuel " + consOfFuel;
	}

}
