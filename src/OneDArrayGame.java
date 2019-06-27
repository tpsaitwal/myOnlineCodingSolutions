import java.util.Scanner;

public class OneDArrayGame {

	public static boolean canWin(int leap, int[] game) {
		int n = game.length;
		for(int i=0; i<n;) {
			System.out.println("Current i "+i);
			if((i+leap)<n && game[i+leap] == 0) {
				i = i+leap;
				System.out.println("i + leap "+i);
			} else if((i+1)<n && game[i+1] == 0) {
				i = i+1;
				System.out.println("i + 1 "+i);
			} else if((i-1) >=0 && game[i-1] ==0) {
				i = i-1;
				System.out.println("i - 1 "+i);
			}
			if(checkN(n, i+leap)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean checkN(int n, int i) {
		if(i>=n-1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
			System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
		}
		scan.close();
	}
}