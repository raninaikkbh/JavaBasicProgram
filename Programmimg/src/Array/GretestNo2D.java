package Array;
// Find the greatest element from array

public class GretestNo2D {
	public static void main(String[] args) {
		int[][] arr = {
				{10,11,12},
				{13,14,15},
				{16,17,18}
			  };
		int max = arr[0][0];
    for(int i=0; i<3; i++) {
	       for(int j=0; j<3; j++) {
	    	   if(max<arr[i][j])
           max = arr[i][j];	
	}
    }
	System.out.println("Greatest Number from the array is : "+max);
}
}

/*
Greatest Number from the array is : 18
*/