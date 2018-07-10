import java.util.Scanner;
class En2_9 {
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //閏年
	};

	static int isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 40 == 0) ? 1 : 0;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int days = d;
		for (int i = 1; i < m; i++)
			days += mdays[isLeapYear(y)][i - 1];
		return 365 + isLeapYear(y) - days;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("年内の残りの日数を求めます。");

		do {
			System.out.print("年:"); int year = stdIn.nextInt();
			System.out.print("月:"); int month = stdIn.nextInt();
			System.out.print("日:"); int day = stdIn.nextInt();
			System.out.printf("残り%d日です。\n", leftDayOfYear(year, month, day));
			System.out.print("もう一度調べますか？(0:はい/1:いいえ) ");
			retry = stdIn.nextInt();
		} while (retry == 0);
	}
}
