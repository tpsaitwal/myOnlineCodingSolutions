import java.math.BigInteger;
import java.util.Scanner;

public class BigIntIsProbablePrime {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger b = scanner.nextBigInteger();
        System.out.println(b.isProbablePrime(1));
        scanner.close();
    }
}