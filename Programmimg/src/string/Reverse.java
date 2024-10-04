package string;

public class Reverse {
	public static void main(String[] args) {
		String str = "This is Programming Batch";
		String[] arr = str.split(" ");
		String revStr = "";
		
		for(int i= arr.length-1; i>=0; i--)
		{
		  revStr += arr[i]+" ";
		}
		System.out.println("Reverse String is : "+revStr);		
	}
}

// Reverse String is : Batch Programming is This 