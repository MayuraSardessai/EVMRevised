package evm;

public class Active implements BallotState{

	@Override
	public void changeState(BallotUnit b) {
		// TODO Auto-generated method stub
		Inactive inact = new Inactive();
		b.setState(inact);
		b.setStatus("Inactive");
	}

}
