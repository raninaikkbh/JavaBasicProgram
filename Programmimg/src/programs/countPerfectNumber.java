package programs;

public class countPerfectNumber {
	public static void main(String[] args) {
		int count = 0;
		for(int j=1; j<=1000; j++)
		{
			int a = j;
			int sum = 0;
				for(int i=1; i<a; i++)
				if(a%i==0) 
				{
					sum+=i;
				}
				if(a==sum) 
				{
					count++;
				}
			}
		    System.out.println("Count : "+count);
			}
	}

/* Output
  Count : 3 
  */
 
