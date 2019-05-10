public class Problem28 {
    public static void main(String[] args) {
        long ans = 0;
        int end = (1001 + 1)/2;
        for(int i = 1; i <= end; i++) {
            ans += calcNthLayerSum(i);
        }
        System.out.println(ans);
    }
    private static long calcNthLayerSum(int n) {
        if(n == 1) {
            return 1;
        }
        long base = 2 * n - 1;
        long sum = 4 * base * base;
        sum -= 12 * (n-1);
        return sum;
    }
}
