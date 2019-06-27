import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetJava {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String [] pair_left = new String[t];
		String [] pair_right = new String[t];


		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		Set<String> hashset=  new HashSet<String>();
		for(int j = 0; j < pair_left.length; j++) {
			hashset.add(pair_left[j] + "-" + pair_right[j]);
			System.out.println(hashset.size());
		}
		s.close();
	}
}
