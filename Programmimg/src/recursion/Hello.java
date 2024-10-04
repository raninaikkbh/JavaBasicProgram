package recursion;

public class Hello {
	public static void print(int a) {
		if(a<10) {
			System.out.println("Hello..."+a);
			print(++a);
		}
	}
	public static void main(String[] args) {
		print(0);
	}
}
