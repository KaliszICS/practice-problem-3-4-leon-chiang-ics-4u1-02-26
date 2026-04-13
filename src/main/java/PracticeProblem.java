import java.lang.reflect.Array;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
		if (n<=0) {
			return new int[] {};
		}
		int[] x = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1;i<=n;i++) {
			list.add(recamanSequence(i));
		}
		for (int i=0;i<n;i++) {
			x[i] = list.get(i);
		}

		return x;
	}

	public static int recamanSequence(int n) {
		if (n==1) {
			return 1;
		}
		if (n==0) {
			return 0;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1;i<n;i++) {
			list.add(recamanSequence(i));
		}
		int prev = recamanSequence(n-1);
		int candidate = prev - n;
		if (candidate > 0 && !list.contains(candidate)) {
			return candidate;
		}
		return prev + n;
	}
 
}
