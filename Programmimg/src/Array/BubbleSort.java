package Array;
//swap the number using bubble sort

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {10,2,50,40,5};
		
		System.out.println("This is Array : ");
		for(int a: arr)
			System.out.println(a+" ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
		        	arr[j] = arr[j+1];
 		        	arr[j+1] = temp;
 
				}
			}
		}
		System.out.println();
		System.out.println("This is sorted Array : ");
		
		for(int a: arr)
			System.out.println(a+" ");
	}
}

/*
 
 This is sorted Array : 
2 
5 
10 
40 
50 

*/
