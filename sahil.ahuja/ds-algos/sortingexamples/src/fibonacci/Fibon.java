package fibonacci;

public class Fibon {
	public static void main(String[] args) {
		int[] f = new int[50];
		f[1] = f[2] = 1;
		for (int i = 3; i <= 10; i++) {
			f[i] = f[i - 1] + f[i - 2];

		}
		for (int i = 1; i <= 10; i++)
			System.out.println(f[i]);
	}

}
