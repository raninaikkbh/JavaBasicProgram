package recursion;

public class P1 {
	public static void main(String[] args) {
		print(0);
	}
public static void print(int a) {
	if(a<10) {
		System.out.println(9 -a);
		print(++a);
	}
}
}
