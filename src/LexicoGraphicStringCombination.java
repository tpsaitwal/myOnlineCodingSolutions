import java.util.Scanner;

public class LexicoGraphicStringCombination {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] subStringArray = new String[s.length() + 1 -k];

		for(int i=0; i<=(s.length() - k); i++) {
			subStringArray[i] = s.substring(i, i+k);
		}

		for(int j=0; j<subStringArray.length-1;j++) {
			for(int k1=0; k1<(subStringArray.length -1 -j);k1++) {
				if(subStringArray[k1].compareTo(subStringArray[k1+1]) >0) {
					String swap= subStringArray[k1];
					subStringArray[k1] = subStringArray[k1+1];
					subStringArray[k1+1] = swap;
				}
			}
		}

		largest = subStringArray[s.length() -k];
		smallest = subStringArray[0];
		return smallest + "\n" + largest;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}