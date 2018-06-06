package testB.aircraft;

import testB.airlineException.AircraftException;

public class CargoAircraft extends Aircraft {

	private final int cargoCapacity;

	public CargoAircraft(String model, String manufact, int rangeOfFlight, int consOfFuel, int cargoCapacity)
			throws AircraftException {
		super(model, manufact, rangeOfFlight, consOfFuel);
		if (cargoCapacity == 0)
			throw new AircraftException("It is not cargo aircraft");
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public int getSeatingCapacity() {
		return 0;
	}

	@Override
	public int getCargoCapacity() {
		return cargoCapacity;
	}

}
