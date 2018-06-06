package testA.run;

import testA.logic.City;
import testA.logic.Region;
import testA.logic.State;

/**
 * Demo class State
 */

public class RunState {

	public static void main(String[] args) {

		try {
			City minsk = new City("Minsk", 348.84, 1982444, "Belarus", "Minskaya obl", "Minski rayon");
			City brest = new City("Brest", 146.12, 34757, "Belarus", "Brestskaya obl", "Brestski rayon");
			City vitsebsk = new City("Vitsebsk", 134.6, 370289, "Belarus", "Vitsebskaya obl", "Vitsebski rayon");
			City gomel = new City("Gomel", 139.77, 535693, "Belarus", "Gomelskaya obl", "Gomelski rayon");
			City grodno = new City("Grodno", 141.98, 370919, "Belarus", "Grodnenskaya obl", "Grodnenski rayon");
			City mogilev = new City("Mogilev", 96.4, 381353, "Belarus", "Mogilevskaya obl", "Mogilevskai rayon");

			Region[] belRegions = new Region[6];
			belRegions[0] = new Region("Minski", 39900, 1422500, minsk);
			belRegions[1] = new Region("Brestski", 32800, 1401200, brest);
			belRegions[2] = new Region("Vitsebski", 40000, 1230800, vitsebsk);
			belRegions[3] = new Region("Gomelski", 40400, 1440700, gomel);
			belRegions[4] = new Region("Grodnenski", 25100, 1075400, grodno);
			belRegions[5] = new Region("Mogilevskai", 29100, 1029400, mogilev);

			State belarus = new State("Belarus", 207600, 9503800, minsk, belRegions);
			System.out.println(belarus.toString());
			System.out.println();

			// Showing the Capital
			System.out.println("The capital of Belarus is " + belarus.getCapital());
			System.out.println();

			// Showing the number of regions
			System.out.println("Number of regions of Belarus - " + belarus.getRegions().length);
			System.out.println();

			// Showing the square of State
			System.out.println("The square of Belarus is " + belarus.getSquare());
			System.out.println();

			// Showing regional centers
			System.out.println("Main city of regions of Belarus: ");
			System.out.println();
			belarus.showRegionsCenters();
		} catch (ClassCastException e) {
			System.err.println("Check the casting " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Check the array index " + e);
		}
	}

}
