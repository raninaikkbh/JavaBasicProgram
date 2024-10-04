package Test;

public class LetterConversionQ2 {
public static void main(String[] args) {
	String s = "aBcdEfGhiJK";
	String[] arr = s.split(" ");
	String ans = " ";
		
			for(String s1 : arr)
				{
					char ch = s1.toUpperCase().charAt(0);
					ans += ch+s1.substring(1)+" ";
					
				}
				
				System.out.println(ans);
			}  
		}

