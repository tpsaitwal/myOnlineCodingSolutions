import java.util.Scanner;

public class StringTokenSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String [] result = null;
		String [] splitters = {" ","!",",","\\?",".","@", "_"};
		for(String splitter: splitters) {
			result = s.split(splitter);
		}
		for(String res: result) {
			System.out.println(res);
		}
		scan.close();
	}
}
