import java.util.Scanner;

class En5_6 {

	static String[] name = {"A軸", "B軸", "C軸"};

	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("円盤[" + no + "]を" + name[x - 1] + "軸から" + name[y - 1] + "軸へ移動");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("ハノイの塔");
		System.out.print("円盤の枚数：");
		int n = stdIn.nextInt();

		move(n, 1, 3);
	}
}
