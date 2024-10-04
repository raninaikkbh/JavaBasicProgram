package Array;
// Find the who Friend gives maximum money

public class Money2D {
	public static void main(String[] args) {
		int [][] money = {
							{101, 99, 500},
							{500,600,199,299},
							{150,100,90,202,20,20,20,80}
		                 };
		
		int maxSum = 0;
		int friend = 0;
		
		for(int i = 0; i<money.length; i++) {
			int sum =0;
			for(int j=0; j<money[i].length; j++) 
			{
				sum += money[i][j];
			}
			if(sum > maxSum)
			{
				maxSum = sum;
				friend = i;
			}
		}
		System.out.println("Friend gives maximum money is : " +(friend +1));
	    System.out.println("Sum of the Money : "+maxSum);
	}
}

/*
Friend gives maximum money is : 2
Sum of the Money : 1598
*/

