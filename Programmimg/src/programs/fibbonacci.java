package programs;

public class fibbonacci {
	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int a;
		for(int i=0; i<10; i++) 
		{
			System.out.print(f1 +" ");
		    a = f1 + f2;
			    f1 = f2;
			    f2 = a;
		}

	}
}

/*

0 1 1 2 3 5 8 13 21 34 

*/