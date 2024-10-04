package Array;
//Simple the min value with zeroth position

public class MinValue {
	public static void main(String[] args) {
		//To get the Random Array
		
		int[] arr = RandomArray.getArray(5);
		System.out.println("THIS IS ARRAY : "+"");
		for(int a: arr)
			System.out.println(a+" ");
		
	
		int minIdx = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[minIdx] >arr[i]) {
				arr[minIdx] =i;
			}
		}
		System.out.println();
		System.out.println("Index of Minmum value "+minIdx);
		
		//To swipe the min value with zeroth position
		int temp = arr[minIdx];
		arr[minIdx] = arr[0];
		arr[0] = temp;
		
		for(int a : arr)
			System.out.println(a+"    ");
	}
}
