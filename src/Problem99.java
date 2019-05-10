import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Problem99 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("p099_base_exp.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("here");
            return;
        }
        int idx = 0;
        int ans = 0;
        double max = 0.0;
        while(sc.hasNext()) {
            idx++;
            String l = sc.next();
            String[] be = l.split(",");
            int base = Integer.parseInt(be[0]);
            int exp = Integer.parseInt(be[1]);
            double val = exp * Math.log(base);
            System.out.println(val);
            if(val > max) {
                max = val;
                ans = idx;
            }
        }
        System.out.println(idx);
        System.out.println(ans);

    }
}
