// 九九の表を表示

public class Multi99Table {

	public static void main(String[] args) {
		//System.out.println("----- 九九の表 -----");

		// 1行目と2行目の処理
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+------------------------");

		for (int k = 1; k <= 9; k++) {
			System.out.printf("%2d |", k);
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++)
					System.out.printf("%3d", i * j);
				System.out.println();
			}
		}

	}
}
