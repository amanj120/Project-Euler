import java.util.HashSet;

public class Problem45 {
    public static void main(String[] args) {
        //System.out.println(calcNthHexagon(3));
        for(int i= 142; i < 100000; i++) {
            long hex = calcNthHexagon(i);
            if(isTriangle(hex) && isPentagon(hex)) {
                System.out.println(hex);
            }
        }
    }

    private static long calcNthHexagon(int nn) {
        long n = (long)nn;
        return n*n*2 - n;
    }

    private static boolean isTriangle(long n) {
        try{
            quadForm((long)1,(long)1,(-2 * n));
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static boolean isPentagon(long n) {
        try{
            quadForm((long)3,(long)-1,(-2 * n));
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
    private static boolean isHexagon(long n) {
        try{
            quadForm((long)2,(long)-1,(-1 * n));
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static long[] quadForm(long a, long b, long c) {
        long negb = -1 * b;
        long inside = b*b - 4*a*c;
        if(inside >= 0) {
            double rootd = Math.sqrt((double)inside);
            long rf = (long)Math.floor(rootd);
            long rc = (long)Math.ceil(rootd);
            long root;
            if(rf*rf == inside) {
                root = rf;
            } else if (rc * rc == inside) {
                root = rc;
            } else {
                throw new IllegalArgumentException("no integer root of determinant");
            }
            long twoa = a * 2;
            long[] ret = new long[2];
            if((negb - root) % twoa == 0) {
                ret[1] = (negb - root)/twoa;
                if(ret[1] < 0) {
                    if ((negb + root) % twoa == 0) {
                        ret[0] = (negb + root)/twoa;
                        return ret;
                    } else {
                        throw new IllegalArgumentException("negative integer root");
                    }
                }
                return ret;
            } else if ((negb + root) % twoa == 0) {
                ret[0] = (negb + root)/twoa;
                if(ret[0] < 0) {
                    throw new IllegalArgumentException("negative integer root");
                }
                return ret;
            } else {
                throw new IllegalArgumentException("no integer roots");
            }

        } else {
            throw new IllegalArgumentException("has no real roots");
        }


    }
}
