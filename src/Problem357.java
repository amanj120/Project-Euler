import java.util.ArrayList;

public class Problem357 {
    public static void main(String[] args) {
        long ans = 0;
        for(int i = 2; i < 100000000; i+= 4) {
            if(!Prime.isPrime(i) && Prime.isPrime(i+1)) {
                boolean p = true;
                int j = 1;
                while (p && j * j <= i) {
                    if (i % j == 0) {
                        p = Prime.isPrime(j + (i / j));
                    }
                    j++;
                }
                if (p) {
                    ans += i;
                }
            }
        }
        //doesn't count 1 and 2
        System.out.println(ans + 3);
    }
}
