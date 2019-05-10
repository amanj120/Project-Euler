import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger ans = BigInteger.TWO;
        ans = ans.pow(1000);
        String str = ans.toString();
        int ret = 0;
        for(int i = 0; i < str.length(); i++) {
            ret += Integer.parseInt("" + str.charAt(i));
        }
        System.out.println(ret);
    }
}
