package Array;
//Find the maximum number

public class MaxNo {
	public static void main(String[] args) {
		int[][] arr = {
							{100},
							{11,99,23},
							{44,42},
							{55,60,610,67}
		               };
		
		int max = arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Maximum Element is : "+max);
	}
}

/*
 Maximum Element is : 610
 */
