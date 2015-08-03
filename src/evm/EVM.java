package evm;

public class EVM {
	Candidate[] candi;
	BallotUnit bu;
	ControlUnit cu;
	Active act;
	
	EVM()
	{
		candi = new Candidate[3];
		bu = new BallotUnit();
		cu = new ControlUnit();
		act = new Active();
	}

	public void working() {
		// TODO Auto-generated method stub
		bu.registerCandidate(candi);
		bu.initiateButton();
		cu.setCount();
		if(bu.getRegistered())
		{
			cu.display(candi);
			cu.setStatus("Sealed!");
			cu.displaySatus(cu.getStatus());
		}
		
		bu.setSlideSwitch(candi.length);
		bu.checkReadyLamp();
		System.out.println("Control Unit is: " + bu.getLampStatus());
		if(bu.getLampStatus().equals("Ready!"))
		{
			bu.castVote(2,cu);
			System.out.println("Vote has been casted...");
			bu.checkReadyLamp();
			System.out.println("Control Unit is: " + bu.getLampStatus());
		}
		else
		{
			System.out.println("Voting under process... please wait...");
			bu.checkReadyLamp();
		}
		//System.out.println("Control Unit is: " + bu.getLampStatus());
		bu.castVote(1,cu);
		System.out.println("===" + bu.getStatus());
		cu.pressBallotButton(bu);
		System.out.println("===" + bu.getStatus());
		cu.pressBallotButton(bu);
		System.out.println("===" + bu.getStatus());
		cu.getResults();
		cu.clear();
		
		
		
		
	}
}
