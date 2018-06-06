package testA.logic;

public class City {

	private String name;
	private double square;
	private int popul;
	private String state;
	private String reg;
	private String ar;

	public City(String name, double square, int popul, String state, String reg, String ar)
			throws IllegalArgumentException {
		if (name == null || square == 0 || popul == 0 || state == null || reg == null || ar == null)
			throw new IllegalArgumentException("Not all parameters are entered ");
		this.name = name;
		this.square = square;
		this.popul = popul;
		this.state = state;
		this.reg = reg;
		this.ar = ar;
	}

	public String getName() {
		return name;
	}

	public Double getSquare() {
		return square;
	}

	public Integer getPopul() {
		return popul;
	}

	public String getState() {
		return state;
	}

	public String getRegion() {
		return reg;
	}

	public String getAria() {
		return ar;
	}

	@Override
	public String toString() {
		return "City: " + name + "\nSquare: " + square + " square metres, " + "\nPopulation: " + popul + "poeple, "
				+ "\nState: " + state + "\nRegion: " + reg + "\nAria: " + ar;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (!(o instanceof City))
			return false;
		City c = (City) o;
		if ((!getName().equals(c.getName())) || (!getSquare().equals(c.getSquare()))
				|| (!getPopul().equals(c.getPopul())) || (!getState().equals(c.getState()))
				|| (!getAria().equals(c.getAria())) || (!getRegion().equals(c.getRegion())))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return getName().hashCode() + getSquare().hashCode() + getPopul().hashCode() + getState().hashCode()
				+ getAria().hashCode() + getRegion().hashCode();
	}
}