package Array;

public class SortestArray {
	public static void main(String[] args) {

		int[] arr = {1,2,3,5,6,0,8,7};
		boolean output = checkSort(arr);
		if(output)
		System.out.println("Array is Sorted...");
		else
		System.out.println("Array is not sorted..");	

	}
	public static boolean checkSort(int[] arr) {
			for(int j=0; j<arr.length-1; j++) 
			{
				if(arr[j]>arr[j+1]) 
					return false;
				}
				return true;
			}
		}


// Array is not sorted..