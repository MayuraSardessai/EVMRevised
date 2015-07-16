package evm;

public class BallotUnit {
	
	int i;
	ReadyLamp rl;
	CandidateButton cb[];
	SlideSwitch ss;
	ControlUnit cu;
	
	BallotUnit()
	{
		rl = new ReadyLamp();
		cb = new CandidateButton[3];
		ss = new SlideSwitch();
	}
	public void registerCandidate(Candidate[] candi) {
		// TODO Auto-generated method stub
		
		for(i=0;i<candi.length;i++)
		{
			candi[i] = new Candidate("Candidate"+i,0);
		}
		
	}
	public void checkReadyLamp() {
		// TODO Auto-generated method stub
		rl.changeState();
		
	}
	public void setSlideSwitch(int length) {
		// TODO Auto-generated method stub
		if(length <= 16)
		{
			ss.setBallotNumber(1);
		}
		else
		{
			if(length >= 17 && length <= 32)
			{
				ss.setBallotNumber(2);
			}
		}
		
	}
	
	void initiateButton()
	{
		for(i=0; i<cb.length;i++)
		{
			cb[i] = new CandidateButton(i+1,0); 
		}
	}
	public void castVote(int j,ControlUnit cu) {
		// TODO Auto-generated method stub
		int count;
		this.cu = cu;
		cu.processVote(j);
		//count = cb[j-1].getCount();
		//cb[j-1].setCount(count++);
	}
	public void changeState() {
		// TODO Auto-generated method stub
		
	}

}
