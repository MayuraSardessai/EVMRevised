package evm;

public class EVM {
	Candidate[] candi;
	BallotUnit bu;
	ControlUnit cu;
	
	EVM()
	{
		candi = new Candidate[3];
		bu = new BallotUnit();
		cu = new ControlUnit();
	}

	public void working() {
		// TODO Auto-generated method stub
		bu.registerCandidate(candi);
		bu.initiateButton();
		cu.display(candi);
		cu.setStatus("Sealed!");
		cu.displaySatus(cu.getStatus());
		bu.checkReadyLamp();
		bu.setSlideSwitch(candi.length);
		bu.castVote(2,cu);
		cu.pressBallotButton(bu);
		
		
		
	}
}
