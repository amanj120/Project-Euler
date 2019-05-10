public class Problem100 {
    public static void main(String[] args) {
        for(long i = 1000000000000L; i < Long.MAX_VALUE; i = i + 1L) {
            double ii = (double) i;
            double root = (1 - (2*ii) + (2*ii*ii));
            if(checkSquare(root)) {
                long ans = (long)(1 + root)/2;
                //System.out.println(ans);
                //double mult = (ans/i) * ((ans-1)/(i-1));
                //System.out.println(mult);
                if((ans * (ans-1) * 2 )== i * i-1) {
                    System.out.println(i);
                    //System.out.println(root);
                    System.out.println(ans);
                    return;
                }

            }
        }
    }

    private static boolean checkSquare(double n) {
        n = n%1;
        double r = Math.floor(Math.sqrt(n));
        return (r*r == n);
    }
}
