package string;

public class Space {
	public static void main(String[] args) {
		String str = "ThisIsProgrammingBatch";
		String ans = " ";
		
		int st = 0;
		int ed = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)<'a')
			{
				st = ed;
				ed = i;
				
				ans += str.substring(st,ed)+" ";
			}
		}
		System.out.println(ans);
	}

}
