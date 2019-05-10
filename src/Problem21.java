public class Problem21 {
    public static void main(String[] args) {
        int[] ds = new int[10000];
        for(int i = 1; i < 10000; i++) {
            ds[i] = d(i);
        }
        for(int i = 0; i < 10000; i++) {
            System.out.println(ds[i]);
        }
        int ret = 0;
        for(int i= 0; i < 10000; i++) {
            for (int j = i + 1; j < 10000; j++) {
                if (ds[i] == j && ds[j] == i) {
                    ret += i;
                    ret += j;
                }
            }
        }
        System.out.println(d(220));
        System.out.println(ret);

    }

    public static int d(int n) {
        int ret = 0;
        for(int i= 1; i < n; i++) {
            if(n%i == 0) {
                ret += i;
            }
        }
        return ret;
    }
}
