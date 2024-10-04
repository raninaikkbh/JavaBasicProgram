package string;
// Print the last letter should be capital

public class LastWordCapital {
	public static void main(String[] args) {
		String str = "this is programmimg batch";
		String[] arr = str.split(" ");
		String ans = " ";
		
		for(String s : arr)
		{	
			char ch = s.toUpperCase().charAt(s.length()-1);
			ans += s.substring(0, s.length()-1)+ch+" ";
		}
		System.out.println(ans);
	}

}


//  thiS iS programmimG batcH