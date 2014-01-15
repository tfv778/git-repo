package hw1;
/** This is 
 * 
 * @author Zhuoming Li
 *
 */

public class Ballot {
	private String name;
	private double bribeAmount;
	
	public Ballot(){
		super();
	};

	public Ballot(String name, double bribeAmount){
		this.name = name;
		this.bribeAmount = bribeAmount;
	}
	
	public boolean equals(Object other){
		if (other == null) return false;
		if (this == other) return true;
		if (other instanceof Ballot )
		return (this.getName().equals(((Ballot)other).getName()));
		else return false;
	}

	public String getName(){
		return name;
	}
	
	public double getBribeAmount(){
		return bribeAmount;
	}
	
	public String toString(){
		return ("Name " +getName() + ", BribeAmount  " + getBribeAmount());
	}
}
