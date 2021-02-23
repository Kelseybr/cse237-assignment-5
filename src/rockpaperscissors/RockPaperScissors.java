package rockpaperscissors;

import support.cse131.ArgsProcessor;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int rounds = ap.nextInt("How many rounds of RPS?");
//		System.out.println(rounds + "rounds");
		
		String[] rps = { "Rock", "Paper", "Scissors"};
		
		String [] playerOne = new String[rounds];
		String [] playerTwo = new String[rounds];
		int cycle = 0;
		int oneWins = 0;
		int twoWins = 0;
		for (int i = 0; i <= rounds-1; ++i) {
			int rando = (int) (Math.random() * 3);
			playerOne[i] = rps[rando];
			playerTwo[i] = rps[cycle];
			if (cycle==2) {
				cycle = 0;
			}
			else {
				cycle = cycle + 1;
			}
			if(playerOne[i]==rps[0] && playerTwo[i]==rps[2] || playerOne[i]==rps[1] && playerTwo[i]==rps[0] || playerOne[i]==rps[2] && playerTwo[i]==rps[1]) {
				oneWins = oneWins + 1;
				System.out.println("Round " + (i+1) + ": Player 1 chose " + playerOne[i] + " and Player 2 chose " + playerTwo[i] + ", Player 1 wins.");
			}
			else {
				if(playerTwo[i]==rps[0] && playerOne[i]==rps[2] || playerTwo[i]==rps[1] && playerOne[i]==rps[0] || playerTwo[i]==rps[2] && playerOne[i]==rps[1]) {
					twoWins = twoWins + 1;
					System.out.println("Round " + (i+1) + ": Player 1 chose " + playerOne[i] + " and Player 2 chose " + playerTwo[i] + ", Player 2 wins.");
				}
				else {
					System.out.println("Round " + (i+1) + ": Player 1 chose " + playerOne[i] + " and Player 2 chose " + playerTwo[i] + ", it's a tie.");
				}
			
			}
			
		}
		double percOneWins = ((double)oneWins / rounds) * 1000.0;
		percOneWins = Math.round(percOneWins);
		percOneWins = percOneWins/ 10.0;
		
		double percTwoWins = ((double)twoWins / rounds) * 1000.0;
		percTwoWins = Math.round(percTwoWins);
		percTwoWins = percTwoWins/ 10.0;
		
		System.out.println("Out of " + rounds + " games, Player 1 won " + percOneWins + "% of the time and Player 2 won " + percTwoWins + "% of the time.");
	}

}
