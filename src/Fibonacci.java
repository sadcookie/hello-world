import java.util.Scanner;

public class Fibonacci {
	public static int FiboResultValue[] = new int[2];

	public static int fibonacci(int n) {
		if (n == 0) {
			FiboResultValue[0]++;
			return 0;
		} else if (n == 1) {
			FiboResultValue[1]++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		int FiboValue[];
		for (int i = 0; i < TestCase; i++) {
			int Fibo_Num = sc.nextInt();
			fibonacci(Fibo_Num);
			System.out.println(FiboResultValue[0] + " " + FiboResultValue[1]);
			FiboResultValue[0]=0;
			FiboResultValue[1]=0;
		}
	}

}
