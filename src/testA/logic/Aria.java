package testA.logic;

public class Aria {

	private String name;
	private double square;
	private int popul;
	private City capital;

	public Aria(String name, double square, int popul, City capital) throws IllegalArgumentException {
		if (name == null || square == 0 || popul == 0 || capital == null)
			throw new IllegalArgumentException("Not all parameters are entered ");
		this.name = name;
		this.square = square;
		this.popul = popul;
		this.capital = capital;
	}

	public Aria(String name, double square, int popul) throws IllegalArgumentException {
		this.name = name;
		this.square = square;
		this.popul = popul;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public Integer getPopul() {
		return popul;
	}

	public void setPopul(int popul) {
		this.popul = popul;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Aria " + getName() + "\nsquare is " + getSquare() + "\npopulatoin is " + getPopul() + "\nmain city is "
				+ getCapital();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (!(o instanceof Aria))
			return false;
		Aria ar = (Aria) o;
		if ((!getName().equals(ar.getName())) || (!getSquare().equals(ar.getSquare()))
				|| (!getPopul().equals(ar.getPopul())) || (!getCapital().equals(ar.getCapital())))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return getName().hashCode() + getSquare().hashCode() + getPopul().hashCode() + getCapital().hashCode();
	}

	public void showCapital() {
		System.out.println("The maincity of " + getName() + " is " + getCapital());
	}

	public void showSquare() {
		System.out.println("The square is " + getSquare());
	}

}
