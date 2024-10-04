package Array;
//find the minimum value

public class Minimumvalue {
	public static void main(String[] args) {
		
		int arr[] = {10,1,3,-2};
		int min = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
