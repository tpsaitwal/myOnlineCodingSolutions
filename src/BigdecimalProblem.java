import java.math.BigDecimal;
import java.util.Scanner;

public class BigdecimalProblem {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];	
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for(int i=0; i<n;i++){
            for(int j=0; j<n-i-1;j++){
            	BigDecimal b1 = new BigDecimal(s[j]);
            	BigDecimal b2 = new BigDecimal(s[j+1]);
                if(b1.compareTo(b2) < 0) {
                	String swap = s[j];
                	s[j] = s[j+1];
                	s[j+1] = swap;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
