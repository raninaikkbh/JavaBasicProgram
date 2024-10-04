package Test;

public class RotateQ1 {
	public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,6};
			
			System.out.println("This is Given Array : ");
			for(int a: arr)
				System.out.println(a+" ");
			
			int n=6;
			while(n>4)
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
			
	}
	}

/*
This is Given Array : 
1 
2 
3 
4 
5 
6 

This is sorted Array : 
5 
6 
1 
2 
3 
4 
*/