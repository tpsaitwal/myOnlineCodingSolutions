import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int inputArr[] = new int[n];
		for(int i=0; i<n; i++) {
			inputArr[i] = scanner.nextInt();
		}

		int count = 0;
		for(int j=n; j>0; j--) {
			for(int k=0; k<n; k++) {
				int sum1 =0;
				for(int h=k; h<j; h++) {
					sum1 += inputArr[h];
				}
				if(sum1<0) count++;
			}
		}
		scanner.close();
		System.out.println(count);
	}

}
