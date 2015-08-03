package evm;

public class Inactive implements BallotState{

	@Override
	public void changeState(BallotUnit b) {
		// TODO Auto-generated method stub
		Active act = new Active();
		b.setState(act);
		b.setStatus("Active");
	}

}
