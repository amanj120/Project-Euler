public class Problem24 {
    private static int idx = 0;
    public static void main(String[] args) {
        lex("", "0123456789");

    }

    private static void lex(String built, String remaining) {
        if(remaining.length() == 0) {
            idx++;
            if(idx == 1000000) {
                System.out.println(built);
            }
            /*if(idx % 1000 == 0) {
                System.out.println(built);
            }*/
            return;
        }
        for(int i= 0; i < remaining.length(); i++) {
            String c = Character.toString(remaining.charAt(i));
            String b = built + c;
            String r;
            if(i != 0 && i != remaining.length() - 1) {
                r = remaining.split(c)[0] + remaining.split(c)[1];
            } else if (i == 0) {
                r = remaining.substring(1);
            } else {
                r = remaining.substring(0, remaining.length() - 1);
            }

            lex(b,r);
        }
        return;
    }
}
