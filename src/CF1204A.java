import java.util.Scanner;

public class CF1204A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        int m = n.length()/2;
        boolean oddLen = (n.length() % 2 != 0);
        boolean onlyOneZero = (n.lastIndexOf('1') == 0);
        if(!onlyOneZero && oddLen){
            m++;
        }
        if(n.length() == 1) {
            m = 0;
        }
        System.out.println(m);
    }
}
