package string;
// important Que

public class Decode {
	public static void main(String[] args) {
		String str = "a3c2e1";
		String s = str;
		for(int i=1; i<str.length(); i++)
		{
			if(i%2!=0)
			{
				int n = str.charAt(i) - '0';
				char ch = str.charAt(i-1);
				
				for(int j=0; j<n; j++)
					ch++;
				
				s = s.substring(0,i)+ ch+ s.substring(i+1);
				System.out.println(s);
			}
		}
	}
}

/*
  adc2e1 
  adcee1
  adceef
 */
