package Array;
// find index of minimum value

public class Program7 {
	public static void main(String[] args) {
		int[] arr = {10,1,0,-2};
		int minIdx = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<arr[minIdx]) {
				minIdx = i;
			}
		}
		System.out.println("Minimum value index : "+minIdx);
	}
}

/*
 
Minimum value index : 3

*/