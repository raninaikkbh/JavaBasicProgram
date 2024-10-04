package Array;
//Rotated the Array

public class RotationalArray {
	public static void main(String[] args) {
		int[] arr = {10,11,12,13,14};
		
		System.out.println("This is Array : ");
		for(int a: arr)
			System.out.println(a+" ");
		
		int n=3;
		while(n>0)
		{
			int last = arr[arr.length-1];
			for(int i=arr.length-1; i>0; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = last;
			n--;
		}
	System.out.println();
	System.out.println("This is sorted Array : ");
	
	for(int a: arr)
		System.out.println(a+" ");
		

		//System.out.println(Arrays.toString(arr));
}
}
