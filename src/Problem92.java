public class Problem92 {

    static int[] endings = new int[10000001];
    public static void main(String[] args) {
        endings[1] = 1;
        endings[89] = 89;
        System.out.println(findNext(89));
        int sum = 0;
        for(int i = 2; i <= 10000000; i++) {
            endings[i] = fillArray(i);
            if(endings[i] == 89) {
                sum++;
            }
        }
        /*
        for(int i = 0; i < 100; i++) {
            System.out.println(endings[i]);
        }*/
        System.out.println(sum);
    }

    private static int fillArray(int n) {
        if(endings[n] == 1 || endings[n] == 89) {
            return endings[n];
        }
        else {
            endings[n] = fillArray(findNext(n));
            return endings[n];
        }

    }

    private static int findNext(int n) {
        String s = "" + n;
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt("" + s.charAt(i)) * Integer.parseInt("" + s.charAt(i));
        }
        return sum;
    }
}
