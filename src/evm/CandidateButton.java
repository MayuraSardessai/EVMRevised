package evm;

public class CandidateButton {

	int serialNumber;
	int count;
	
	CandidateButton(int serialNumber, int count)
	{
		this.serialNumber = serialNumber;
		this.count = count;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
