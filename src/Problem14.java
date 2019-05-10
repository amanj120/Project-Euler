import java.util.Arrays;

// n => n/2 if even
// n => 3n + 1 if odd

public class Problem14 {
	public static long[] sqn = new long[2000000];
	public static void main(String[] args) {
		long ans = 0;
		long max = 0;
		Arrays.fill(sqn, -1);
		sqn[0] = 0;
		sqn[1] = 1;
		for(int i = 2; i < 1000000; i++) {
			sqn[i] = findChainLength(i);
			if(sqn[i] > max) {
				max = sqn[i];
				ans = i;
				System.out.println(ans);
			}
		}

	}

	public static long findChainLength(long cur) {
		if(sqn[(int) cur] != -1) {
			return sqn[(int) cur];
		}
		if(cur%2 == 0) {
			return 1 + findChainLength(cur/2);
		}
		else {
			long l = 1;
			cur = 3*cur + 1;
			while(cur > 1000000) {
				if(cur%2 == 0) {
					cur/=2;
				}
				else {
					cur = 3*cur + 1;
				}
				l++;
			}
			return (l + findChainLength(cur));
		}
	}

}
