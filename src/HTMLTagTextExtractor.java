import java.util.Scanner;

public class HTMLTagTextExtractor {
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			String line2 = line.substring(line.indexOf('<')+1, line.indexOf('>'));
			System.out.println(line2);
			String line3 = line.substring(line.indexOf(line2+">")+line2.length()+1, line.indexOf("</"+line2));
			System.out.print(line3);
			testCases--;
		}
		in.close();
	}
}
