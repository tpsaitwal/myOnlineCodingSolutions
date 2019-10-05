import java.util.Scanner;

public class StringTokenSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String [] splitters = {"!",",","?",".","@", "_", "'"," "};
		for(String splitter: splitters) {
				s = s.replace(splitter, "=");
		}
		
		String [] result =  s.split("=");
		for(String result1 :result) {
			System.out.println(result1);
		}
	}
}
