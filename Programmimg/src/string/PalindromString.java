package string;
// Check string is palindrom or not

public class PalindromString {
	public static void main(String[] args) {
	String str = "ab aa ba aa ab";
	String[] arr = str.split(" ");
	String revStr = "";
	
	for(int i=arr.length-1; i>=0; i--) 
	revStr += arr[i]+" ";
	
	revStr = revStr.trim();
	//System.out.println(revStr+"a");    remove the space
	
	if(revStr.equals(str))
		System.out.println("String is Palindrom");
	else
		System.out.println("String is not palindrom");
	
	}
}

// String is Palindrome