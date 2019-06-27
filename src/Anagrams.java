import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	if(a.length() != b.length())
    		return false;
    	
    	char [] aArr = a.toLowerCase().toCharArray();
    	char [] bArr = b.toLowerCase().toCharArray();
    	
    	for(int i=0;i<aArr.length;i++) {
    		for(int j=0;j<(aArr.length-i-1);j++) {
    			if(aArr[j] < aArr[j+1]) {
    				char aSwap = aArr[j];
    				aArr[j] = aArr[j+1];
    				aArr[j+1] = aSwap;
    			}
    			if(bArr[j] < bArr[j+1]) {
    				char bSwap = bArr[j];
    				bArr[j] = bArr[j+1];
    				bArr[j+1] = bSwap;
    			}
    		}
    	}
    	
    	for (int k=0; k<aArr.length;k++) {
    		if(aArr[k] != bArr[k]) {
    			return false;
    		}
    	}
    	return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}