package string;
// Find out the balance string

public class BalanceString {
	public static void main(String[] args) {
		String str = "QJQJQQJJ";
		int a = 0;
		int count  = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'Q')
			{
				a++;
			}
			else
			{
				a--;
			}
			if(a==0)
			{
				count ++;
			}
		}
		System.out.println("Total Balance String are : "+count);
	}
}

// Total Balance String are : 3
