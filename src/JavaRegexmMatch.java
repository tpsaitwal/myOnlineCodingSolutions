import java.util.Scanner;

class JavaRegexmMatch{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IP = in.next();
			System.out.println(IP.matches(MyRegex.pattern));
		}
		in.close();
	}
}	

class MyRegex{	
	public static String pattern ="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}