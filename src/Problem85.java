public class Problem85 {
    public static void main(String[] args) {
        int ans = 1;
        long dif = 2000000;
        for(int w = 1; w <= Math.sqrt(1000000); w++) {
            for(int h = 1; h <= 1000000/w; h++) {
                long sum = 0;
                for(int j = 1; j <= w; j++) {
                    for(int i = 1; i <= h; i++) {
                        sum += (w-j+1) * (h-i+1);
                        if(sum - 2000000 > dif) {
                            break;
                        }
                    }
                    if(sum - 2000000 > dif) {
                        break;
                    }
                }
                if(sum - 2000000 > dif) {
                    break;
                }
                long thisdif = Math.max(sum, 2000000) - Math.min(sum, 2000000);
                if(thisdif < dif) {
                    dif = thisdif;
                    ans = w*h;
                    //System.out.println(dif + " " + w + " " + h + " " + w*h + " " + sum);
                }
            }
        }
        System.out.println(ans);
    }
}
