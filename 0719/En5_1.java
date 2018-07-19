import java.util.Scanner;

class En5_1 {
	static int factorial(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++)
			total *= i;
		return total;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数を入力せよ:");
		int x = stdIn.nextInt();
		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}
}
