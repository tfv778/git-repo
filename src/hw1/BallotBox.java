package hw1;
/** This is the BallotBox class which is basically a wrapper that specifies the T as Ballot.
 * It contains a variable of a member of ArrayListBag that is casted as a BagInterface so that only the methods contained in the BagInterface can be used.
 * 
 * @author Zhuoming Li
 */
public class BallotBox {
	private BagInterface<Ballot> ballots;
	
/**
 * @param void
 */
	public BallotBox(){
		ballots = new ArrayListBag<Ballot>();
		
	}
	
/**
 * @param Ballot
 * @return boolean
 */
	public boolean add(Ballot aBallot){
		return ballots.add(aBallot);
	}
	
/**
 * @param void
 * @return Ballot
 */
	public Ballot remove(){
		return ballots.remove();
	}
	
/** 
 * @param void
 * @return boolean
 */
	public boolean isEmpty(){
		return ballots.isEmpty();
	}
	
/**
 * @param void
 * @return BagInterface<Ballot>
 */
	public BagInterface<Ballot> getBallots(){
		return ballots;
	}
}
