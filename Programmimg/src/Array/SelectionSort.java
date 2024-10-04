package Array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = RandomArray.getArray(5);
		System.out.println("THIS IS ARRAY : "+"");
		for(int a: arr)
			System.out.println(a+" ");
		
	for(int i=0; i<arr.length;i++) {
		int minIdx = i;
		for(int j=0; j<arr.length;j++) {
			if(arr[minIdx] >arr[j]) {
				minIdx =j;
			}
		}
		System.out.println();
		
		//To swipe the min value with zeroth position
		int temp = arr[i];
		arr[i] = arr[minIdx];
		arr[minIdx] = temp;
	}
		for(int a : arr)
			System.out.println(a+"  ");
	}
	}

