package evm;

public class ClearButton implements Button{
	int i=0;
	@Override
	public void doAction(Integer[] count) {
		// TODO Auto-generated method stub
		for(i=0;i<count.length;i++)
		{
			count[i] = 0;
		}
		
	}


}
