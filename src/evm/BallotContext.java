package evm;

public class BallotContext {
	private BallotState state;

	   public BallotContext(){
	      state = null;
	   }

	   public void setState(BallotState state){
	      this.state = state;		
	   }

	   public BallotState getState(){
	      return state;
	   }
}
