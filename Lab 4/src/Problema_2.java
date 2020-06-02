import java.util.Arrays;

public class Problema_2 {
	public int[] removeX(int n, int arr[], int x, int pos) {
		int i;

		int ArrayForRemove[] = new int[n];

		for (i = 0; i < pos; i++)
			ArrayForRemove[i] = arr[i];

		for (i = pos; i < n - 1; i++)

			ArrayForRemove[i] = arr[i];

		return ArrayForRemove;
	}

}