import java.util.Arrays;
import java.util.HashSet;

public class Problem49 {
    public static void main(String[] args) {
        System.out.println(Prime.isPrime(1828));
        for(int starting = 1000; starting <= 9999; starting++) {
            for(int dist = 1; dist < 3333; dist++) {
                if(Prime.isPrime(starting)) {
                    if(Prime.isPrime(starting + dist) && starting + dist <= 9999) {
                        if(Prime.isPrime(starting + dist + dist) && starting + dist + dist <= 9999) {
                            if (checkPerm(starting, dist)) {
                                System.out.println(starting + "" + (starting + dist) + "" + (starting + dist + dist));
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean checkPerm(int s, int d) {
        char[] a = new char[4];
        char[] b = new char[4];
        char[] c = new char[4];
        String ss = "" + s;
        for(int i = 0; i < 4; i++) {
            a[i] = ss.charAt(i);
        }
        s += d;
        ss = "" + s;
        for (int i = 0; i < 4; i++) {
            b[i] = ss.charAt(i);
        }
        s += d;
        ss = "" + s;
        for (int i = 0; i < 4; i++) {
            c[i] = ss.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        for(int i = 0; i < 4; i++) {
            if (a[i] != b[i] || b[i] != c[i]) {
                return false;
            }
        }
        return true;
    }
}
