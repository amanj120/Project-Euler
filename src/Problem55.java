import java.util.ArrayList;

public class Problem55 {
    //int[] lychrel = new int[10000]; //-1 means it's a palindromic number
    private static ArrayList<Integer> lychrels = new ArrayList<>();
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {
            System.out.println(i);
            long c = calcPalinSum((long)i);
            boolean add = true;
            for(int iter = 1; iter <= 50; iter++) {
                if(isPalindrome(c)) {
                    iter = 52;
                    add = false;
                } else {
                    try {
                        c = calcPalinSum(c);
                    } catch (Exception e) {
                        iter = 52;
                    }
                }
            }
            if(add) {
                lychrels.add(i);
                System.out.println(i);
            }
        }
        System.out.println(lychrels.size());

    }

    private static long calcPalinSum(long n) {
        String s = "" + n;
        String mirror = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            mirror += s.charAt(i);
        }
        long mirrorn = Long.parseLong(mirror);
        return n + mirrorn;
    }

    private static boolean isPalindrome(long n) {
        return isPalindrome("" + n);
    }
    private static boolean isPalindrome(String s) {
        if(s.length() == 1) {
            return true;
        }
        if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) {
                return true;
            } else {
                return false;
            }
        }
        return (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1)));
    }

}
