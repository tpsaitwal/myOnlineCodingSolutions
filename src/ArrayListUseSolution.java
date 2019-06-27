import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListUseSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List listOfDs = new ArrayList<>();
		for(int i=1; i<=n ; i++) {
			int d = sc.nextInt();
			List innerList = new ArrayList<>();
			for(int j=1; j<=d; j++) {
				innerList.add(sc.nextInt());
			}
			listOfDs.add(innerList);
		}
		int q = sc.nextInt(); 
		int [][] numberOfQueries= new int[q][2];
		for(int i=0; i<q;i++) {
			numberOfQueries[i][0] = sc.nextInt();
			numberOfQueries[i][1] = sc.nextInt();
		}

		for(int k=0; k<numberOfQueries.length;k++) {
			int x = numberOfQueries[k][0]-1;
			int y = numberOfQueries[k][1]-1;
			try {
				List array = (List) listOfDs.get(x);
				System.out.println(array.get(y));
			}catch(IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}
}
