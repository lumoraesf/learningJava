package numbers;

public class calculationDetails {

	public static void main(String[] args) {
		int totalSeconds = 42*60 + 42;
		double numMiles = 10/1.61;
		double numMeters = 1000;
		float speedKilometers = 10 / totalSeconds;
		double speedMiles = numMiles / totalSeconds;
		double speedMeters = numMeters / totalSeconds;
		
		System.out.println("How many seconds are there in 42 minutes "
				+ "and 42 seconds? " + totalSeconds);
		System.out.println("How many miles are there in 10km? "
				+ numMiles);
		System.out.println("If you run a 10km race and it takes you "
				+ "42min and 42s, what's your speed in km/s? "
				+ speedKilometers + "\nWhat about miles/s? "
				+ speedMiles + "\nAnd m/s? " + speedMeters);

	}

}
