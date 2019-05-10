import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            BigInteger k = BigInteger.ZERO;
            for(int j = 0; j < i; j++) {
                k = k.add(BigInteger.ONE);
            }
            ans = ans.multiply(k);
            System.out.println(ans);
        }

        String g = ans.toString();
        int ret = 0;
        for(int i = 0; i < g.length(); i++) {
            ret += Integer.parseInt(g.charAt(i) + "");
        }
        System.out.println(ret);
    }
}
