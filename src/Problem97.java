public class Problem97 {
    public static void main(String[] args) {
        long two = 1;
        long mod = 10000000000L;
        for(int i = 0; i < 7830457; i++) {
            two = (two * 2) % mod;
            //System.out.println(two);
        }
        two *= 28433;
        two %= mod;
        two += 1;
        System.out.println(two);
    }
}
