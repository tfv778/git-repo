package hw1;
/** This is the BallotBox class which is basically a wrapper that specifies the T as Ballot.
 * @author Zhuoming Li
 */
public class BallotBox {
	private BagInterface<Ballot> ballots;
	
	public BallotBox(){
		ballots = new ArrayListBag<Ballot>();
		
	}
	
	public boolean add(Ballot aBallot){
		return ballots.add(aBallot);
	}
	
	public Ballot remove(){
		return ballots.remove();
	}
	
	public boolean isEmpty(){
		return ballots.isEmpty();
	}
	
	public BagInterface<Ballot> getBallots(){
		return ballots;
	}
}
