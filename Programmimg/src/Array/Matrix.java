package Array;

public class Matrix {
	public static void main(String[] args) {
	int[][] arr = {
						{10,11,12},
						{13,14,15},
						{16,17,18}
	              };
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
	}
}



/* matrix (input)
           
10 11 12 
13 14 15 
16 17 18 

Transpose Matrix (outPut)
 
10 13 16 
11 14 17 
12 15 18 
 
*/