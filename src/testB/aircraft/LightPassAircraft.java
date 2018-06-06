package testB.aircraft;

import testB.airlineException.AircraftException;

public class LightPassAircraft extends Aircraft {

	private final int seatingCapacity;

	public LightPassAircraft(String model, String manufact, int rangeOfFlight, int consOfFuel, int seatingCapacity)
			throws AircraftException {
		super(model, manufact, rangeOfFlight, consOfFuel);
		if (seatingCapacity == 0)
			throw new AircraftException("It is not light-passenger aircraft");
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public int getCargoCapacity() {
		return 0;
	}

}
