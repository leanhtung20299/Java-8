package Package;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LambdaExpress s = (a,b) ->{
			 System.out.println(a+b);
		};
		int a = sc.nextInt();
		int b = sc.nextInt();
		s.calce(a, b);
	}
}
