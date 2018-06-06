package testB.aircraft;

import testB.airlineException.AircraftException;

public class CommercialPassAircraft extends Aircraft {

	private final int seatingCapacity;
	private final int cargoCapacity;

	public CommercialPassAircraft(String model, String manufact, int rangeOfFlight, int consOfFuel, int cargoCapacity,
			int seatingCapacity) throws AircraftException {
		super(model, manufact, rangeOfFlight, consOfFuel);
		if (cargoCapacity == 0 || seatingCapacity == 0)
			throw new AircraftException("It is not commertial-passenger aircraft");
		this.seatingCapacity = seatingCapacity;
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public int getCargoCapacity() {
		return cargoCapacity;
	}

}
