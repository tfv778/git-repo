package hw1;
/** This is the Ballot class. It represents the votes.
 * @author Zhuoming Li
 */

public class Ballot {
	private String name;
	private double bribeAmount;
	
	public Ballot(){
		super();
	};

/**
 * @param name
 * @param bribeAmount
 */
	public Ballot(String name, double bribeAmount){
		this.name = name;
		this.bribeAmount = bribeAmount;
	}
	
/**
 * @param Object
 * @return boolean
 */
	public boolean equals(Object other){
		if (other == null) return false;
		if (this == other) return true;
		if (other instanceof Ballot )
		return (this.getName().equals(((Ballot)other).getName()));
		else return false;
	}

/**
 * @param void
 * @return String
 */
	public String getName(){
		return name;
	}
	
/**
 * @param void
 * @return double
 */
	public double getBribeAmount(){
		return bribeAmount;
	}
	
/**
 * @param void
 * @return String
 */
	public String toString(){
		return ("Name " +getName() + ", BribeAmount  " + getBribeAmount());
	}
}
