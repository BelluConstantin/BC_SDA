import java.util.Arrays;

public class Problema_1 {

	public int[] addX(int n, int arr[], int x, int pos) {
		int i;

		int ArrayForAdd[] = new int[n + 1];

		for (i = 0; i < pos; i++)
			ArrayForAdd[i] = arr[i];

		ArrayForAdd[pos] = x;

		for (i = pos + 1; i <= n; i++)

			ArrayForAdd[i] = arr[i - 1];

		return ArrayForAdd;
	}
}