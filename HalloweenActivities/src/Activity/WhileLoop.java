package Activity;

import java.lang.Math;

public class WhileLoop {

	public static void main(String[] args) {
		double zombiePopulation = 10.0;
		int day = 0;
		
		while (zombiePopulation < 1000.0) {
			day++;
			// generating random growth in percentage between 1 and 100
			// we sum 1 because it starts at one
			// math.random returns a double between 0.0 and 1.0 so we have to multiply by 100
			int growthRate = (int) (Math.random() * 100) + 1;
			
			// remember to put 100 as a float, else the division won't work unless growthRate is precisely 100
			double growthDay = zombiePopulation * (growthRate/100.0);
			
			// adds daily growth and rounds to integer because zombies can't be divided
			zombiePopulation += (int)Math.round(growthDay);
			
			System.out.println("Day: " + day + "| Growth Rate: " + growthRate + "% | Zombie Population: " + zombiePopulation);
		}
		
		System.out.println("The halloween program ends in " + day + " days.");

	}

}
