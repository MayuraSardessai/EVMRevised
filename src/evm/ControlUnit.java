package evm;

public class ControlUnit {
	int i=0;
	String status;
	Integer[] count;
	
	ControlUnit()
	{
		count = new Integer[3];
	}
	public void display(Candidate[] candi) {
		// TODO Auto-generated method stub
		
		for(i=0;i<candi.length;i++)
		{
			System.out.println("Candidate name: " + candi[i].name + "\nCandidate count: "+candi[i].count);
		}
		
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
	}
	public void displaySatus(String status2) {
		// TODO Auto-generated method stub
		System.out.println("Control Unit Satus: ");
		
	}
	public void processVote(int j) {
		// TODO Auto-generated method stub
		count[j-1]++;
		
	}
	public void pressBallotButton(BallotUnit bu) {
		// TODO Auto-generated method stub
		// change the state of the ballot Unit
		bu.changeState();
		
	}

}
