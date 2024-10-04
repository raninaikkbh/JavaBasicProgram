package string;

import java.util.Arrays;

public class ArrangeString {
public static void main(String[] args) {
	String str = "2Is Ba4tch T1his Progr3amming";
	String[] words = str.split(" ");
	String[] ans = new String[words.length];
	
	for(String s : words)
	{
		char[] chArr = s.toCharArray();
		Arrays.sort(chArr);
		int idx  = chArr[0] - '0';
		String wds = s.replace(idx+"", "");
		System.out.println(idx +"  :  "+wds);
		ans[idx-1]= wds;
	}
	System.out.println(Arrays.toString(ans));
}
}

/*
2  :  Is
4  :  Batch
1  :  This
3  :  Programming
[This, Is, Programming, Batch]
*/