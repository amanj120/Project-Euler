import java.util.HashSet;

public class Problem44 {
    private static HashSet<Integer> pentagons = new HashSet<>();
    private static int size = 10000;
    private static int [] pents = new int[size];
    public static void main(String[] args) {
        fillPentagons(size);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int diff = pents[j] - pents[i];
                int sum = pents[j] + pents[i];
                if(diff < min) {
                    if (pentagons.contains(diff) && pentagons.contains(sum)) {
                        min = diff;
                    }
                }
            }
        }
        System.out.println(min);
    }

    private static void fillPentagons(int n) {
        for(int i = 1; i <= n; i++) {
            int pent = (i * (3*i - 1))/2;
            //System.out.println(pent);
            pentagons.add(pent);
            pents[i-1] = pent;
        }
    }
}
