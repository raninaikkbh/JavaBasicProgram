package Array;
//Display The all element 

public class Display2D {
	public static void main(String[] args) {
		int[][] arr = {
						{10,11,12},
						{13,14,15},
						{16,17,18}
					  };
		//Using For Loop
		
	/*	for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
		           System.out.print(arr[i][j]+" ");		
			}
			System.out.println();
		}
	*/
		
		//using enhance For Loop
		
		for(int[] a1 : arr) {
		for(int a : a1)
			System.out.print(a+" ");
		System.out.println();
		}
	}
}
/*
10 11 12 
13 14 15 
16 17 18 
*/