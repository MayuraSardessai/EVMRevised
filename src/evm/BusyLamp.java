package evm;

public class BusyLamp implements Lamp{

	@Override
	public void changeState(BallotUnit bu) {
		// TODO Auto-generated method stub
		ReadyLamp ready = new ReadyLamp();
		bu.setLampState(ready);
		bu.setLampStatus("Ready!");
	}

}
