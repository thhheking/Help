
public class Applicant implements Comparable<Applicant> {
	private String name;
	private int score;
	// add the rest of fields (education, experience, annual profit)
	
	//Complete this constructor 
	// you should calculate this.score based on estimated annual profit
	public Applicant() {
		//Complete this constructor 
		// you should calculate this.score based on estimated annual profit
	}
	
	public int compareTo(Applicant other){
		if (this.score > other.score)
			return 1;
		else if (this.score < other.score)
			return -1;
		else
			return 0;
		// you can just write it in one line:
		// return this.score - other.score
	}
	
	// this method will be used to find an applicant
	public boolean equals(Applicant other) {
		return this.name.equals(other.name);
	}
	
	public String toString() {
		//complete this method
		//it will be useful for print option in class Loan 
		return "";
	}
	
	// add any other method you need
}
