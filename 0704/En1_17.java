import java.util.Scanner;

class En1_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		System.out.println("ピラミッドを表示します。");
		System.out.print("段数は:");
		n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++)
				System.out.print(' ');
			for (int j = 1; j <= (i-1)*2+1; j++)
				System.out.print(i%10);
			System.out.println();
		}
	}
}
