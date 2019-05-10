import java.math.BigInteger;

public class Problem25 {
    public static void main(String[] args) {
        BigInteger A = BigInteger.ONE;
        BigInteger B = BigInteger.ONE;
        int idx = 2;
        while(B.toString().length() < 1000) {
            BigInteger C = A.add(B);
            A = B;
            B = C;
            idx++;
            //System.out.println(B.toString());
        }
        System.out.println(idx);
    }
}
