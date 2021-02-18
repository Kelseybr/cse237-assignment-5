package speedlimit;

import support.cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int repSpeed = ap.nextInt("What is the reported speed?");
		int speedLimit = ap.nextInt("What is the speed Limit?");
		
		if(repSpeed > speedLimit) {
			int milesOver = repSpeed - speedLimit;
			int firstTen = 100;
			int remainMiles = milesOver - 10;
			int additionalFine = remainMiles * 10;
			int fine = firstTen + additionalFine;
			if(milesOver<=10) {
				System.out.println("You reported a speed of " + repSpeed + " MPH for a speed limit of " + speedLimit + " MPH.");
				System.out.println("You went " + milesOver + " MPH over the speed limit.");
				System.out.println("Your fine is $" + firstTen + ".");
			}
			else {
				System.out.println("You reported a speed of " + repSpeed + " MPH for a speed limit of " + speedLimit + " MPH.");
				System.out.println("You went " + milesOver + " MPH over the speed limit.");
				System.out.println("Your fine is $" + fine + ".");
			}
			
		}
		else {
			System.out.println("Have a nice day.");
			
			
		}
		
	}

}
