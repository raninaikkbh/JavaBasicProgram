package string;
// Chess box is white or black

public class Chess {
	public static void main(String[] args) {
		String str = "G7";
		
		int ch1 = str.charAt(0) - '@';
		int ch2 = str.charAt(1) - '0';
		
		
		if((ch1 + ch2 )% 2 == 0)
		    System.out.println("Chess Block is white");
		else
			System.out.println("Chess Block is Black");
	}
}

// H5:  Chess Block is Black
// G7 : Chess Block is white