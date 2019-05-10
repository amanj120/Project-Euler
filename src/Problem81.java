import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem81 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("p081_matrix.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
            return;
        }
        long[][] mat = new long[80][80];
        for(int i = 0; i < 80; i++) {
            String s = sc.next();
            String[] nums = s.split(",");
            for (int j = 0; j < 80; j++) {
                mat[i][j] = Long.parseLong(nums[j]);
            }
        }

        for (int i = 79; i >= 0; i--) {
            for (int j = 79; j >= 0; j--) {
                long d,r;
                try {
                    d = mat[i+1][j];
                } catch (IndexOutOfBoundsException e) {
                    d = Integer.MAX_VALUE/2;
                }
                try {
                    r = mat[i][j+1];
                } catch (IndexOutOfBoundsException e) {
                    r = Integer.MAX_VALUE/2;
                }
                if(!(i == 79 && j == 79)) {
                    mat[i][j] += Math.min(d, r);
                }
            }
        }
        System.out.println(mat[0][0]);
    }
}
