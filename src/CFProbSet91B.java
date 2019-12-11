import java.util.*;

public class CFProbSet91B {
    private static int[] w;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        w = new int[n];
        TreeMap<Integer, TreeSet<Integer>> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int ww = sc.nextInt();
            if(tm.containsKey(ww)) {
                tm.get(ww).add(i);
            } else {
                tm.put(ww, new TreeSet<>(Arrays.asList(i)));
            }
        }
        TreeSet<Integer> indexes = new TreeSet<>();
        //for each age, add it to the set of indeces less than, and then just find the highest value in this set.
        for(int i :  tm.keySet()) {
            //indexes.add(tm.get(i));


        }
        sc.close();
    }

}
