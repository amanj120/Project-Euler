import java.util.ArrayList;
import java.util.HashSet;

public class Problem23 {
    private static ArrayList<Integer> abundants = new ArrayList<>();
    public static void main(String[] args) {
        calculateAbundants();
        HashSet<Integer> sums = new HashSet<>();
        for(int i = 0; i < abundants.size(); i++) {
            for(int j = 0; j < abundants.size(); j++) {
                sums.add(abundants.get(i) + abundants.get(j));
            }
        }
        long ret = 0;
        for(int i = 0; i <= 28123; i++) {
            if(!sums.contains(i)) {
                ret += i;
            }
        }
        System.out.println(ret);

    }

    private static void calculateAbundants() {
        for(int i = 1; i <= 28123; i++) {
            int sum = 0;
            for(int j = 1; j < i; j++) {
                if (i%j == 0) {
                   sum += j;
                }
            }
            if (sum > i) {
                abundants.add(i);
            }
        }
    }
}
