package evm;

public class ResultSection {
	
	Result1 r1;
	Result2 r2;
	String resultStatus;
	ClearButton clear;
	TotalButton total;
	//Close close;
	//Clear clear;
	ResultSection()
	{
		r1 = new Result1();
		r2 = new Result2();
		clear = new ClearButton();
		total = new TotalButton();
	}

	boolean isResultSectionOpen(String status)
	{
		if(status.equals("open"))
		{
			return true;
		}
		return false;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public void showResults(Integer[] count) {
		// TODO Auto-generated method stub
		
		r1.pole1Results(count);
		
	}
	
	void pressClearButton(Integer[] count)
	{
		clear.doAction(count);
	}
	
	void totalButton(Integer[] count)
	{
		total.doAction(count);
	}
}
