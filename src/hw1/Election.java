package hw1;
/** This is hw1. This is the election class which contains the main method. 
 * It prints out the choices and let people choose.
 * @author Zhuoming Li
 * @version 1.0 Jan. 13th 2014
 */
import java.util.Scanner;

public class Election {
/**This is the main method.
 * @param args
 * @return void
 */
	public static void main(String[] args){
		BallotBox aBallotBox = new BallotBox();
		BagInterface<Ballot> ballots = aBallotBox.getBallots();
		boolean isDone = false;
		System.out.println("Welcome to the election! What would you like to do?");
		System.out.println("1: Vote for a candidate");
		System.out.println("2: Count the number of votes for a candidate");
		System.out.println("3: Remove a vote");
		System.out.println("4: Get number of votes in the ballot box");
		System.out.println("5: Empty ballot box");
		System.out.println("6: Print all votes");
		System.out.println("7: Quit");
		while (isDone == false){ 
		System.out.println("Enter your choice here:");
		Scanner keyboard = new Scanner(System.in); //assume the input will be an integer
		int i = keyboard.nextInt();
		switch (i) {
		case 1: 
			//add a ballot
			System.out.println("Please type in the name of the candidate you would like to vote for: ");
			Scanner keyboardName = new Scanner(System.in);
			String name = keyboardName.next();
			System.out.println("Please type in bribe amount: ");
			Scanner keyboardBribeAmount = new Scanner(System.in);
			double bribeAmount = keyboardBribeAmount.nextDouble();
			ballots.add(new Ballot(name, bribeAmount));
			System.out.println("Vote added successfully");
			break;
		case 2: 
			// count the votes for a particular candidate
			System.out.println("Please type in the name of the candidate for whom the votes you would like to count: ");
			keyboardName = new Scanner(System.in);
			name = keyboardName.next();
			int frequency = ballots.getFrequencyOf(new Ballot(name,1));
			System.out.println("The number is " + frequency);
			break;
		case 3:
			//remove a vote
			System.out.println("1: to remove a random one");
			System.out.println("2: to remove a specific one");
			Scanner keyboardRemove = new Scanner(System.in);
			int m = keyboardRemove.nextInt();
			if (m==1) {
					Ballot ballotRemoved = ballots.remove();
					System.out.println("You have removed the vote: " + ballotRemoved);
			}
			else if (m==2){
					System.out.println("Please enter the name of the person whose vote you want to remove");
					Scanner keyboardNameRemove = new Scanner(System.in);
					String nameRemove = keyboardNameRemove.next();
					boolean done = false; 
					int q = 0;
					Object[] arr = ballots.toArray();
					while ( done == false){
						if (arr[q].equals(new Ballot(nameRemove, 1)))
								ballots.remove((Ballot) arr[q]);
								System.out.println("A vote for " + arr[q] + " has been removed");	
								done = true;}
			}
			else System.out.println("Sorry your input is not valid");
			break;
		case 4:
			//getCurrentSize()
			System.out.println("We have " + ballots.getCurrentSize() + " votes right now");
			break;
		case 5:
			//clear();
			ballots.clear();
			System.out.println("The ballot box is empty now");
			break;
		case 6:
			//print; 
			Object[] ballotArray = ballots.toArray();
			for (Object occur:ballotArray){
				System.out.println(occur);
			}
			break;
		case 7: 
			//quit
			isDone = true;
			System.out.println("Thank you!");
			break;	
		default: System.out.println("Please enter a valid number:");
		}}
	}
	
}

