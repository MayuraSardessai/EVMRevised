package evm;

public class BallotUnit {
	
	int i;
	String status="Active";
	String lampStatus="Busy";
	ReadyLamp rl;
	CandidateButton cb[];
	SlideSwitch ss;
	ControlUnit cu;
	BallotState state;
	boolean registered = false;
	Lamp lampState;
	
	BallotUnit()
	{
		rl = new ReadyLamp();
		cb = new CandidateButton[3];
		ss = new SlideSwitch();
		Active act = new Active();
		state = act; 
		BusyLamp busy = new BusyLamp();
		lampState = busy;
		//this.setState(act);
	}
	public void registerCandidate(Candidate[] candi) {
		// TODO Auto-generated method stub
		
		for(i=0;i<candi.length;i++)
		{
			candi[i] = new Candidate("Candidate"+i,0);
		}
		registered = true;
	}
	public void checkReadyLamp() {
		// TODO Auto-generated method stub
		lampState.changeState(this);
		
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
	public void castVote(int j,ControlUnit cntrlu) {
		// TODO Auto-generated method stub
		//int count;
		this.cu = cntrlu;
		System.out.println("Vote ----> " + j);
		cu.processVote(j);
		//count = cb[j-1].getCount();
		//cb[j-1].setCount(count++);
	}
	public void switchState() {
		// TODO Auto-generated method stub
		state.changeState(this);
		
	}
	  public void setState(BallotState state){
	      this.state = state;		
	   }

	   public BallotState getState(){
	      return state;
	   }

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	
	public boolean getRegistered()
	{
		return registered;
	}
	public Lamp getLampState() {
		return lampState;
	}
	public void setLampState(Lamp lampState) {
		this.lampState = lampState;
	}
	public String getLampStatus() {
		return lampStatus;
	}
	public void setLampStatus(String lampStatus) {
		this.lampStatus = lampStatus;
	}
	

}
