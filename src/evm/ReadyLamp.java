package evm;

public class ReadyLamp implements Lamp{

	@Override
	public void changeState(BallotUnit bu) {
		// TODO Auto-generated method stub
		BusyLamp ready = new BusyLamp();
		bu.setLampState(ready);
		bu.setLampStatus("Busy!");
		
	}

	
}
