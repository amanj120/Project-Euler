public class Problem206 {
    public static void main(String[] args) {
        long min = (long) Math.ceil(Math.sqrt(1020304050607080900.0));
        long max = (long) Math.ceil(Math.sqrt(1929394959697989990.0));
        char[] match = {'1','2','3','4','5','6','7','8','9','0'};
        for(long i = min; i <= max; i++) {
            String s = "" + (i*i);
            String n = "";
            for(int j = 0; j <=18; j+=2) {
                n = n + s.charAt(j);
            }
            //System.out.println(s);
            //System.out.println(n);
            if(n.equals("1234567890")) {
                System.out.println(i);
                System.out.println(i*i);
                return;
            }
            //System.out.println(s);
        }
    }
}
