package string;
// Firts letter should be Capital

public class CapitalWord {
	public static void main(String[] args) {
		String str = "this is programmimg batch";
		String[] arr = str.split(" ");
		String ans = " ";
		
		for(String s : arr)
		{
			char ch = s.toUpperCase().charAt(0);
			ans += ch+s.substring(1)+" ";
			
		}
		System.out.println(ans);
	}
}

//  This Is Programmimg Batch 