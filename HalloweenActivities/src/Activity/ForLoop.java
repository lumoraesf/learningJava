package Activity;

import java.lang.Math;

public class ForLoop {

	public static void main(String[] args) {
		int witches = 100;
		
		// 8 hours of work
		for (int hour = 1; hour <= 8; hour++) {
			// 5-20 witches fly away every hour
			int flownWitches = (int) (Math.random() * 16) + 5;
			// making sure only witches that are there fly away
			if (flownWitches > witches) {
				flownWitches = witches;
			}
			witches = witches - flownWitches;
			
			if (witches < 0) {
				witches = 0;
			}
			
			System.out.println("Hour: " + hour + " | Flown Witches: " + flownWitches + " | Whiches left: " + witches);
			
			if (witches <=0 ) {
				System.out.println("All the witches have flown away!");
				break; // exits the loop immediately
			}
			
		}
		
		System.out.println("End of the Halloween Program, hahahhaha!");

	}

}
