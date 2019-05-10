import java.util.Arrays;

public class Problem52 {
    public static void main(String[] args) {
        for(int i = 1; i < 1000000; i++) {
            boolean found = true;
            for(int j = 2; j <=6; j++) {
                if(!perm(i, j*i)) {
                    found = false;
                }
            }
            if (found) {
                System.out.println(i);
            }
        }
    }

    private static boolean perm(int x, int y) {
        String xx = "" + x;
        String yy = "" + y;
        char[] a = new char[xx.length()];
        char[] b = new char[yy.length()];
        for(int i = 0; i < xx.length(); i++) {
            a[i] = xx.charAt(i);
        }
        for (int i = 0; i < yy.length(); i++) {
            b[i] = yy.charAt(i);
        }
        if(a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < xx.length(); i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
