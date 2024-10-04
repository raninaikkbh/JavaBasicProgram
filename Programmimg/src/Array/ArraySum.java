package Array;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6};
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
	}
			if(sum%2 == 0) {
				System.out.println("Sum is Even");
			}
			else
			{
				System.out.println("Sum is odd");
				arr[0] = arr[0]+1;
			}
		}
	}
