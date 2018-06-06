package testA.logic;

/**
 * Create an application that meets the requirements specified in the task.
 * Inheritance applies only to those tasks in which it is logically is
 * justified. Argument the belonging to the class of each created method and
 * correctly redefine for each class methods equals (), hashCode (), toString
 * ().
 * 
 *   Create a class object State using the Classes Region, Area, City. Methods:
 * bring to the console the capital, the number of regions, square, regional
 * centers.
 * 
 * Execute tasks based on variant A of Ch. 4, controlling the state of the input
 * / output streams. In the event of errors related to the correctness of
 * mathematical operations, generate and process exceptions. Provide handling of
 * exceptions that occur when The lack of memory, the absence of the required
 * record (object) in the file, the value of the field, and so on.
 */

public class State extends Region {

	private Region[] regions;

	public State(String name, double square, int popul, City capital, int n) {
		super(name, square, popul, capital);
		regions = new Region[n];
	}

	public State(String name, double square, int popul, City capital, Region[] regions) {
		super(name, square, popul, capital);
		this.regions = regions;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	@Override
	public String toString() {
		return "Stste " + getName() + "\nsquare is " + getSquare() + "\npopulatoin is " + getPopul() + "\nmain city is "
				+ getCapital() + "\ncontains " + getRegions().length + " regions";
	}

	@Override
	public void showCapital() {
		System.out.println("The capital is " + getCapital());
	}

	public void showNumberOfRegions() {
		System.out.println("The state has " + getRegions().length);
	}

	public void showRegionsCenters() {
		try {
			for (Region x : getRegions())
				x.showCapital();
		} catch (NullPointerException e) {
			System.err.println("There are no regions in the list " + e);
		}

	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (!(o instanceof State))
			return false;
		State st = (State) o;
		if ((!getName().equals(st.getName())) || (!getSquare().equals(st.getSquare()))
				|| (!getPopul().equals(st.getPopul())) || (!getCapital().equals(st.getCapital()))
				|| (!getRegions().equals(st.getRegions())))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return getName().hashCode() + getSquare().hashCode() + getPopul().hashCode() + getCapital().hashCode()
				+ getRegions().hashCode();
	}

}
