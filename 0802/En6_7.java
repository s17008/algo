import java.util.Scanner;
class En6_7 {
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			for (int k = 0; k < n; k++)
				System.out.printf("%3d", a[k]);
			System.out.println();

			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;

			// j 挿入位置
			// i 挿入対象
			for (int k = 0; k < j; k++)
				System.out.print("   ");
			if (j < i) {
				System.out.print(" ^-");
				for (int k = j + 1; k < i; k++)
					System.out.print("---");
				System.out.print("--+");
			} else {
				System.out.print("  +");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("単純挿入ソート");
		System.out.print("要素数:");
		int nx = stdIn.nextInt();
		int [] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		insertionSort(x, nx);

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}
}
