package testA.logic;

public class Region extends Aria {

	private Aria[] arias;

	public Region(String name, double square, int popul, City capital, int n) {
		super(name, square, popul, capital);
		arias = new Aria[n];
	}

	public Region(String name, double square, int popul, City capital, Aria[] arias) {
		super(name, square, popul, capital);
		this.arias = arias;
	}

	public Region(String name, double square, int popul, City capital) {
		super(name, square, popul, capital);
	}

	public Aria[] getArias() {
		return arias;
	}

	public void setArias(Aria[] arias) {
		this.arias = arias;
	}

	@Override
	public String toString() {
		return "Region " + getName() + "\nsquare is " + getSquare() + "\npopulatoin is " + getPopul()
				+ "\nmain city is " + getCapital() + "\ncontains " + getArias().length + " arias";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (!(o instanceof Region))
			return false;
		Region reg = (Region) o;
		if ((!getName().equals(reg.getName())) || (!getSquare().equals(reg.getSquare()))
				|| (!getPopul().equals(reg.getPopul())) || (!getCapital().equals(reg.getCapital()))
				|| (!getArias().equals(reg.getArias())))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return getName().hashCode() + getSquare().hashCode() + getPopul().hashCode() + getCapital().hashCode()
				+ getArias().hashCode();
	}

}
