public class fib {
    private static int size = 1000;
    private static int[] a;
    private static int[] b;

    public static void main(String[] args){
        init();
        for(int i = 0; i < 1000000; i++) {
            int[] c = b;
            b = add();
            a = c;
        }
        System.out.println("b");
        for(int i = 0; i < 100; i++) {
            System.out.println(phi(i));
        }
    }

    private static void init() {
        a = new int[size];
        b = new int[size];
        reset();
    }
    private static void reset() {
        a[size-1] = 1;
        b[size-1] = 1;
    }

    private static int[] add() {
        int[] ret = new int[size];
        int remainder = 0;
        for(int i = size-1; i >= 0; i--) {
            long sum = (long)a[i] + (long)b[i] + (long)remainder;
            long max = (long) Integer.MAX_VALUE;
            max = max + 1;
            remainder = (int) (sum / max);
            ret[i] = (int) (sum % max);
        }
        return ret;
    }

    private static double phi(int n) {
        return (n == 0? 1 : 1 + (1/(phi(--n))));
    }

}
