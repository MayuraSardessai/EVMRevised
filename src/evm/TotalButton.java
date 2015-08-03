package evm;

public class TotalButton implements Button{
	int total=0;
	int i;
	@Override
	public void doAction(Integer[] count) {
		// TODO Auto-generated method stub
		System.out.println("===== Polling Results ======");
		for(i=0;i<count.length;i++)
		{
			total = total + count[i];
			System.out.println("Candidate "+i+" :"+count[i]);
		}
		System.out.println("Total votes: " + total);
	}

}
