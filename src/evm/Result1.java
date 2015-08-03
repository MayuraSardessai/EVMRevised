package evm;

public class Result1 {
	
	int total=0;
	int i=0;

	void pole1Results(Integer[] count)
	{
		System.out.println("****** Pole Results 1 ******");
		for(i=0;i<count.length;i++)
		{
			total = total + count[i];
			System.out.println("Candidate"+i+ " : " + count[i]);
		}
		System.out.println("Total count: " + total);
	}
}
