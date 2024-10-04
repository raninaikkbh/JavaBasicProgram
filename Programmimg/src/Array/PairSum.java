package Array;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30,40,50,60};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j])==70)
					System.out.println(arr[i]+"  :  "+arr[j]);
			}
	   }
	}
}

/* Out put : 
 
10  :  60      10+60=70
20  :  50      20+60=70
30  :  40

*/
