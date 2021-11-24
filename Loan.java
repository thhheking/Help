import java.util.ArrayList;

public class Loan {
	private PriorityQueue<Applicant> activeList;
	private ArrayList<Applicant> approvedList;
	private ArrayList<Applicant> rejectedList;
	private int budget;
	
	public Loan () {
		activeList = new PriorityQueue<Applicant>();
		approvedList = new ArrayList<Applicant>();
		rejectedList = new ArrayList<Applicant>();
		budget = 0;
	}
	
	public void run() {
		/* print the options for the Loan app  and execute them
		 * 
		 * Possible operations:
		 * Load applications
         * Set the budget
         * Make a decision
         * Print
         * Update an application (there is a method find() in PriorityQueue 
         *                        that you can use to find the applicant 
         *                        you would like to update)
		*/
	}
	
}
